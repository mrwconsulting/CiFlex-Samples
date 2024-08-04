[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [stage](../README.md) / StageManager

# Class: StageManager

## Constructors

### new StageManager()

> **new StageManager**(`manager`): [`StageManager`](StageManager.md)

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `manager` | [`PluginManager`](../../plugins/classes/PluginManager.md) |

#### Returns

[`StageManager`](StageManager.md)

#### Source

[src/ciflex/stage.ts:38](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L38)

## Properties

| Property | Modifier | Type | Default value |
| :------ | :------ | :------ | :------ |
| `_manager` | `private` | [`PluginManager`](../../plugins/classes/PluginManager.md) | `undefined` |
| `_shellStepMap` | `private` | `Map`\<`string`, `CodeBuildStep` \| `ManualApprovalStep` \| `ShellStep`\> | `...` |

## Methods

### addStage()

> **addStage**(`scope`, `pipeline`, `parent`, `props`, `env`?): `CodePipeline`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `scope` | `Construct` |
| `pipeline` | `CodePipeline` |
| `parent` | [`CiFlexProps`](../../ciflex/interfaces/CiFlexProps.md) |
| `props` | [`StageProps`](../interfaces/StageProps.md) |
| `env`? | `Environment` |

#### Returns

`CodePipeline`

#### Source

[src/ciflex/stage.ts:42](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L42)

***

### addStep()

> **addStep**(`id`, `scope`, `stageName`, `options`): `CodeBuildStep` \| `ManualApprovalStep` \| `ShellStep`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `id` | `string` |
| `scope` | `Construct` |
| `stageName` | `string` |
| `options` | [`StepOptions`](../../props/interfaces/StepOptions.md) |

#### Returns

`CodeBuildStep` \| `ManualApprovalStep` \| `ShellStep`

#### Source

[src/ciflex/stage.ts:98](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L98)

***

### addToShellStepMap()

> `private` **addToShellStepMap**(`name`, `step`, `stageName`?): `void`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `name` | `string` |
| `step` | `CodeBuildStep` \| `ManualApprovalStep` \| `ShellStep` |
| `stageName`? | `string` |

#### Returns

`void`

#### Source

[src/ciflex/stage.ts:312](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L312)

***

### buildImage()

> `private` **buildImage**(`scope`, `id`, `pluginName`): `IBuildImage`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `scope` | `Construct` |
| `id` | `string` |
| `pluginName` | `string` |

#### Returns

`IBuildImage`

#### Source

[src/ciflex/stage.ts:307](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L307)

***

### partialBuildSpecFile()

> `private` **partialBuildSpecFile**(`pluginName`): `undefined` \| `string`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `pluginName` | `string` |

#### Returns

`undefined` \| `string`

#### Source

[src/ciflex/stage.ts:302](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L302)

***

### pluginDefinition()

> `private` **pluginDefinition**(`pluginName`): [`PluginDefinition`](../../props/interfaces/PluginDefinition.md)

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `pluginName` | `string` |

#### Returns

[`PluginDefinition`](../../props/interfaces/PluginDefinition.md)

#### Source

[src/ciflex/stage.ts:296](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L296)

***

### process()

> `private` **process**(`scope`, `parent`, `props`, `wave`, `type`, `options`): `Wave`

#### Parameters

| Parameter | Type | Default value |
| :------ | :------ | :------ |
| `scope` | `Construct` | `undefined` |
| `parent` | [`CiFlexProps`](../../ciflex/interfaces/CiFlexProps.md) | `undefined` |
| `props` | [`StageProps`](../interfaces/StageProps.md) | `undefined` |
| `wave` | `Wave` | `undefined` |
| `type` | [`ActionType`](../../types/type-aliases/ActionType.md) | `'PreStep'` |
| `options` | [`StepOptions`](../../props/interfaces/StepOptions.md)[] | `[]` |

#### Returns

`Wave`

#### Source

[src/ciflex/stage.ts:251](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/stage.ts#L251)
