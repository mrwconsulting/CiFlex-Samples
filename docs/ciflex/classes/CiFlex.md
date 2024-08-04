[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [ciflex](../README.md) / CiFlex

# Class: CiFlex

## Constructors

### new CiFlex()

> `private` **new CiFlex**(`region`, `account`, `props`, `config`): [`CiFlex`](CiFlex.md)

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `region` | `string` |
| `account` | `string` |
| `props` | [`CiFlexProps`](../interfaces/CiFlexProps.md) |
| `config` | [`CiFlexConfig`](../../props/interfaces/CiFlexConfig.md) |

#### Returns

[`CiFlex`](CiFlex.md)

#### Source

[src/ciflex/ciflex.ts:53](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L53)

## Properties

| Property | Modifier | Type | Default value |
| :------ | :------ | :------ | :------ |
| `_app` | `private` | `App` | `undefined` |
| `_config` | `private` | [`CiFlexConfig`](../../props/interfaces/CiFlexConfig.md) | `undefined` |
| `_pluginManager` | `private` | [`PluginManager`](../../plugins/classes/PluginManager.md) | `...` |
| `_props` | `private` | [`CiFlexProps`](../interfaces/CiFlexProps.md) | `undefined` |
| `_stack` | `private` | `Stack` | `undefined` |

## Methods

### addTag()

> `private` **addTag**(`scope`, `key`, `value`): `void`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `scope` | `Construct` |
| `key` | `string` |
| `value` | `string` |

#### Returns

`void`

#### Source

[src/ciflex/ciflex.ts:323](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L323)

***

### addToEvent()

> `private` **addToEvent**(`str`): `PipelineNotificationEvents`[]

#### Parameters

| Parameter | Type | Default value |
| :------ | :------ | :------ |
| `str` | `string`[] | `[]` |

#### Returns

`PipelineNotificationEvents`[]

#### Source

[src/ciflex/ciflex.ts:309](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L309)

***

### input()

> `private` **input**(`props`): `CodePipelineSource`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `props` | [`SourceProps`](../../props/interfaces/SourceProps.md) |

#### Returns

`CodePipelineSource`

#### Source

[src/ciflex/ciflex.ts:276](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L276)

***

### stack()

> **stack**(): `Stack`

#### Returns

`Stack`

#### Source

[src/ciflex/ciflex.ts:117](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L117)

***

### synth()

> **synth**(): `CloudAssembly`

#### Returns

`CloudAssembly`

#### Source

[src/ciflex/ciflex.ts:271](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L271)

***

### init()

> `static` **init**(`props`): `Promise`\<[`CiFlex`](CiFlex.md)\>

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `props` | [`CiFlexProps`](../interfaces/CiFlexProps.md) |

#### Returns

`Promise`\<[`CiFlex`](CiFlex.md)\>

#### Source

[src/ciflex/ciflex.ts:68](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/ciflex.ts#L68)
