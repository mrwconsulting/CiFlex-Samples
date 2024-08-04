FROM node:20-alpine3.19
RUN apk add --no-cache curl wget tar aws-cli gettext-envsubst

ENV VERSION=0.6.14
RUN wget -O aws-iam-authenticator https://github.com/kubernetes-sigs/aws-iam-authenticator/releases/download/v${VERSION}/aws-iam-authenticator_${VERSION}_linux_amd64
RUN chmod +x aws-iam-authenticator && mv aws-iam-authenticator /usr/local/bin

RUN curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
RUN install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl