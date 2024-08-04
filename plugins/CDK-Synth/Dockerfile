FROM node:20-alpine3.19
RUN apk add --no-cache git jq aws-cli

ARG APP_FOLDER=/usr/app
WORKDIR ${APP_FOLDER}
COPY ["bootstrap.zip","./"]