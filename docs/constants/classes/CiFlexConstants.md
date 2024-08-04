[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [constants](../README.md) / CiFlexConstants

# Class: CiFlexConstants

## Constructors

### new CiFlexConstants()

> **new CiFlexConstants**(): [`CiFlexConstants`](CiFlexConstants.md)

#### Returns

[`CiFlexConstants`](CiFlexConstants.md)

## Properties

| Property | Modifier | Type | Default value |
| :------ | :------ | :------ | :------ |
| `CLOUDWATCH_DEPLOY_PIPELINE_LOG_GROUPNAME` | `readonly` | `"/aws/lambda/deploy-pipeline"` | `'/aws/lambda/deploy-pipeline'` |
| `CLOUDWATCH_DESTROY_PIPELINE_LOG_GROUPNAME` | `readonly` | `"/aws/lambda/destroy-pipeline"` | `'/aws/lambda/destroy-pipeline'` |
| `CLOUDWATCH_LOG_GROUP_CLASS` | `readonly` | `"STANDARD"` | `'STANDARD'` |
| `CONFIG_COMPUTE_TYPE` | `readonly` | `SMALL` | `ComputeType.SMALL` |
| `CONFIG_DYNAMODB_ONETABLE` | `readonly` | `"ciflex-registry"` | `'ciflex-registry'` |
| `CONFIG_IMAGE_REPOSITORY` | `readonly` | `"ciflex-repository"` | `'ciflex-repository'` |
| `CONFIG_SUBNET_TYPE` | `readonly` | `PRIVATE_WITH_EGRESS` | `SubnetType.PRIVATE_WITH_EGRESS` |
| `DEFAULT_API` | `readonly` | `"https://localhost/api/"` | `'https://localhost/api/'` |
| `DEFAULT_CDK_VERSION` | `readonly` | `"2.144.0"` | `'2.144.0'` |
| `DEFAULT_CFN_RESPONSE_VERSION` | `readonly` | `"1.0.0"` | `'1.0.0'` |
| `DEFAULT_CIFLEX_FORMAT` | `readonly` | `"JSON"` | `'JSON'` |
| `DEFAULT_CIFLEX_REGISTRY` | `readonly` | `"npm.pkg.github.com"` | `'npm.pkg.github.com'` |
| `DEFAULT_CIFLEX_SCOPE` | `readonly` | `"@mrwconsulting"` | `'@mrwconsulting'` |
| `DEFAULT_COMPUTE_TYPE` | `readonly` | `"SMALL"` | `'SMALL'` |
| `DEFAULT_DEEPMERGE_VERSION` | `readonly` | `"7.0.2"` | `'7.0.2'` |
| `DEFAULT_DYNAMODB_ONETABLE` | `readonly` | `"ciflex-registry"` | `CiFlexConstants.CONFIG_DYNAMODB_ONETABLE` |
| `DEFAULT_ENV` | `readonly` | `object` | `...` |
| `DEFAULT_EXECUTION_MODE` | `readonly` | `QUEUED` | `ExecutionMode.QUEUED` |
| `DEFAULT_HASHCODE_VERSION` | `readonly` | `"3.0.0"` | `'3.0.0'` |
| `DEFAULT_IMAGE_REPOSITORY` | `readonly` | `"ciflex-repository"` | `CiFlexConstants.CONFIG_IMAGE_REPOSITORY` |
| `DEFAULT_LAMBDA_VERSION` | `readonly` | `"8.10.138"` | `'8.10.138'` |
| `DEFAULT_MANUAL_APPROVAL_TITLE` | `readonly` | `"PLEASE_APPROVE"` | `'PLEASE_APPROVE'` |
| `DEFAULT_ONETABLE_VERSION` | `readonly` | `"2.7.2"` | `'2.7.2'` |
| `DEFAULT_OUTPUT_DIRECTORY` | `readonly` | `"/tmp/cdk.out"` | `'/tmp/cdk.out'` |
| `DEFAULT_PIPELINE_TYPE` | `readonly` | `V2` | `PipelineType.V2` |
| `DEFAULT_REGION` | `readonly` | `"us-east-1"` | `'us-east-1'` |
| `DEFAULT_SDK_VERSION` | `readonly` | `"3.588.0"` | `'3.588.0'` |
| `DEFAULT_WORKSPACE` | `readonly` | `"./"` | `'./'` |
| `DEFAULT_YAML_VERSION` | `readonly` | `"2.4.3"` | `'2.4.3'` |
| `MAX_LENGTH` | `readonly` | `12` | `12` |
| `NOTIFICATION_EVENTS` | `readonly` | `PipelineNotificationEvents`[] | `...` |
| `PARAMETER_STORE_CLIENT_ID_KEY` | `readonly` | `"/mrwconsulting/ciflex/client-id"` | `'/mrwconsulting/ciflex/client-id'` |
| `PARAMETER_STORE_RESTAPI_KEY` | `readonly` | `"/mrwconsulting/ciflex/restapi"` | `'/mrwconsulting/ciflex/restapi'` |
| `REQUIRED_ARTIFACT_OPTIONS` | `readonly` | `object` | `...` |
| `REQUIRED_COMMANDS` | `readonly` | `string`[] | `...` |
| `REQUIRED_INSTALL_COMMANDS` | `readonly` | `string`[] | `[]` |
| `SECRET_CIFLEX_CONFIG` | `readonly` | `"mrwconsulting/ciflex/config"` | `'mrwconsulting/ciflex/config'` |
