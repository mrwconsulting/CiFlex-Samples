[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [props](../README.md) / GhostStageProps

# Interface: GhostStageProps

## Extends

- `StageProps`

## Properties

| Property | Modifier | Type | Description | Inherited from |
| :------ | :------ | :------ | :------ | :------ |
| `env?` | `readonly` | `Environment` | <p>Default AWS environment (account/region) for `Stack`s in this `Stage`.</p><p>Stacks defined inside this `Stage` with either `region` or `account` missing from its env will use the corresponding field given here.</p><p>If either `region` or `account`is is not configured for `Stack` (either on the `Stack` itself or on the containing `Stage`), the Stack will be</p><p>*environment-agnostic*.</p><p>Environment-agnostic stacks can be deployed to any environment, may not be able to take advantage of all features of the CDK. For example, they will not be able to use environmental context lookups, will not automatically translate Service Principals to the right format based on the environment's AWS partition, and other such enhancements.</p><p>**Example**</p><code>// Use a concrete account and region to deploy this Stage to<p>new Stage(app, 'Stage1', {</p><p>  env: { account: '123456789012', region: 'us-east-1' },</p><p>});</p><p>// Use the CLI's current credentials to determine the target environment</p><p>new Stage(app, 'Stage2', {</p><p>  env: { account: process.env.CDK_DEFAULT_ACCOUNT, region: process.env.CDK_DEFAULT_REGION },</p><p>});</p></code><p>**Default**</p><ul><li>The environments should be configured on the `Stack`s.</li></ul> | `StageProps.env` |
| `outdir?` | `readonly` | `string` | <p>The output directory into which to emit synthesized artifacts.</p><p>Can only be specified if this stage is the root stage (the app). If this is specified and this stage is nested within another stage, an error will be thrown.</p><p>**Default**</p><code>- for nested stages, outdir will be determined as a relative<p>directory to the outdir of the app. For apps, if outdir is not specified, a</p><p>temporary directory will be created.</p></code> | `StageProps.outdir` |
| `permissionsBoundary?` | `readonly` | `PermissionsBoundary` | <p>Options for applying a permissions boundary to all IAM Roles and Users created within this Stage</p><p>**Default**</p><code>- no permissions boundary is applied</code> | `StageProps.permissionsBoundary` |
| `policyValidationBeta1?` | `readonly` | `IPolicyValidationPluginBeta1`[] | <p>Validation plugins to run during synthesis. If any plugin reports any violation, synthesis will be interrupted and the report displayed to the user.</p><p>**Default**</p><code>- no validation plugins are used</code> | `StageProps.policyValidationBeta1` |
| `stackName?` | `readonly` | `string` | - | - |
| `stageName?` | `readonly` | `string` | <p>Name of this stage.</p><p>**Default**</p><code>- Derived from the id.</code> | `StageProps.stageName` |
