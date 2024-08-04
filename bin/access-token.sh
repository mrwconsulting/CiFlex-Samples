#!/bin/sh
set -e
set +x
set -o pipefail
if [ "${DEBUG}" == "true" ]; then
    set +x
fi

DEFAULT_USERNAME='admin'
DEFAULT_PASSWORD='Password01!'
DEFAULT_REGION='us-east-1'
PARAMETER_STORE_KEY='/mrwconsulting/ciflex/client-id'

read -e -p  "Enter cognito username [$DEFAULT_USERNAME]: " COGNITO_USERNAME
COGNITO_USERNAME="${COGNITO_USERNAME:-$DEFAULT_USERNAME}"
read -e -p  "Enter cognito password [$DEFAULT_PASSWORD]: " COGNITO_PASSWORD
COGNITO_PASSWORD="${COGNITO_PASSWORD:-$DEFAULT_PASSWORD}"
read -e -p  "Enter region [$DEFAULT_REGION]: " AWS_REGION
AWS_REGION="${AWS_REGION:-$DEFAULT_REGION}"

CLIENT_ID=$(aws ssm get-parameter \
        --region 'us-east-1' \
        --name ${PARAMETER_STORE_KEY} \
        --query Parameter.Value \
        --output text )
ACCESS_TOKEN=$(aws cognito-idp initiate-auth  \
        --region ${AWS_REGION} \
        --client-id ${CLIENT_ID} \
        --auth-flow USER_PASSWORD_AUTH \
        --query "AuthenticationResult.IdToken" \
        --output text \
        --auth-parameters USERNAME=${COGNITO_USERNAME},PASSWORD=${COGNITO_PASSWORD})

echo "CIFLEX_ACCESS_TOKEN=${ACCESS_TOKEN}"
