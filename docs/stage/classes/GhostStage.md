[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [stage](../README.md) / GhostStage

# Class: GhostStage

## Extends

- `Stage`

## Constructors

### new GhostStage()

> **new GhostStage**(`scope`, `id`, `props`): [`GhostStage`](GhostStage.md)

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `scope` | `Construct` |
| `id` | `string` |
| `props` | [`GhostStageProps`](../../props/interfaces/GhostStageProps.md) |

#### Returns

[`GhostStage`](GhostStage.md)

#### Overrides

`Stage.constructor`

#### Source

[src/ciflex/stage.ts:321](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L321)

## Properties

| Property | Modifier | Flags | Type | Description | Inherited from |
| :------ | :------ | :------ | :------ | :------ | :------ |
| `_assemblyBuilder` | `readonly` | `Internal` | `CloudAssemblyBuilder` | The cloud assembly builder that is being used for this App | `Stage._assemblyBuilder` |
| `_stack` | `private` |  | `Stack` | - | - |
| `account?` | `readonly` |  | `string` | The default account for all resources defined within this stage. | `Stage.account` |
| `node` | `readonly` |  | `Node` | <p>The tree node.</p><p>**Stability**</p><p>stable</p> | `Stage.node` |
| `parentStage?` | `readonly` |  | `Stage` | <p>The parent stage or `undefined` if this is the app.</p><p>*</p> | `Stage.parentStage` |
| `policyValidationBeta1` | `readonly` |  | `IPolicyValidationPluginBeta1`[] | <p>Validation plugins to run during synthesis. If any plugin reports any violation, synthesis will be interrupted and the report displayed to the user.</p><p>**Default**</p><code>- no validation plugins are used</code> | `Stage.policyValidationBeta1` |
| `region?` | `readonly` |  | `string` | The default region for all resources defined within this stage. | `Stage.region` |
| `stageName` | `readonly` |  | `string` | The name of the stage. Based on names of the parent stages separated by hypens. | `Stage.stageName` |

## Accessors

### artifactId

> `get` **artifactId**(): `string`

Artifact ID of the assembly if it is a nested stage. The root stage (app)
will return an empty string.

Derived from the construct path.

#### Returns

`string`

#### Source

node\_modules/aws-cdk-lib/core/lib/stage.d.ts:150

***

### assetOutdir

> `get` **assetOutdir**(): `string`

The cloud assembly asset output directory.

#### Returns

`string`

#### Source

node\_modules/aws-cdk-lib/core/lib/stage.d.ts:143

***

### outdir

> `get` **outdir**(): `string`

The cloud assembly output directory.

#### Returns

`string`

#### Source

node\_modules/aws-cdk-lib/core/lib/stage.d.ts:139

## Methods

### stack()

> **stack**(): `Stack`

#### Returns

`Stack`

#### Source

[src/ciflex/stage.ts:329](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L329)

***

### synth()

> **synth**(`options`?): `CloudAssembly`

Synthesize this stage into a cloud assembly.

Once an assembly has been synthesized, it cannot be modified. Subsequent
calls will return the same assembly.

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `options`? | `StageSynthesisOptions` |

#### Returns

`CloudAssembly`

#### Inherited from

`Stage.synth`

#### Source

node\_modules/aws-cdk-lib/core/lib/stage.d.ts:157

***

### toString()

> **toString**(): `string`

Returns a string representation of this construct.

#### Returns

`string`

#### Inherited from

`Stage.toString`

#### Stability

stable

#### Source

node\_modules/constructs/lib/construct.d.ts:319

***

### ~~isConstruct()~~

> `static` **isConstruct**(`x`): `x is Construct`

(deprecated) Checks if `x` is a construct.

#### Parameters

| Parameter | Type | Description |
| :------ | :------ | :------ |
| `x` | `any` | Any object. |

#### Returns

`x is Construct`

true if `x` is an object created from a class which extends `Construct`.

#### Inherited from

`Stage.isConstruct`

#### Deprecated

use `x instanceof Construct` instead

#### Source

node\_modules/constructs/lib/construct.d.ts:299

***

### isStage()

> `static` **isStage**(`x`): `x is Stage`

Test whether the given construct is a stage.

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `x` | `any` |

#### Returns

`x is Stage`

#### Inherited from

`Stage.isStage`

#### Source

node\_modules/aws-cdk-lib/core/lib/stage.d.ts:96

***

### of()

> `static` **of**(`construct`): `undefined` \| `Stage`

Return the stage this construct is contained with, if available. If called
on a nested stage, returns its parent.

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `construct` | `IConstruct` |

#### Returns

`undefined` \| `Stage`

#### Inherited from

`Stage.of`

#### Source

node\_modules/aws-cdk-lib/core/lib/stage.d.ts:91
