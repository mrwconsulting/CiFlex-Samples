[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [plugins](../README.md) / PluginManager

# Class: PluginManager

## Constructors

### new PluginManager()

> `private` **new PluginManager**(): [`PluginManager`](PluginManager.md)

#### Returns

[`PluginManager`](PluginManager.md)

#### Source

[src/ciflex/plugins.ts:13](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/plugins.ts#L13)

## Properties

| Property | Modifier | Type | Default value |
| :------ | :------ | :------ | :------ |
| `_cached` | `private` | `Map`\<`string`, `any`\> | `...` |
| `_model` | `private` | `Model`\<`Flatten`\<`Merge`\<`Required`\<`object`\>, `OptionalOrUndefined`\<`object`\>\>\>\> | `undefined` |
| `_instance` | `private` | [`PluginManager`](PluginManager.md) | `undefined` |

## Methods

### cached()

> **cached**(`pluginName`): `any`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `pluginName` | `string` |

#### Returns

`any`

#### Source

[src/ciflex/plugins.ts:34](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/plugins.ts#L34)

***

### getItem()

> `private` **getItem**(`pluginName`, `isActive`): `Promise`\<`undefined` \| `Flatten`\<`Merge`\<`Required`\<`object`\>, `OptionalOrUndefined`\<`object`\>\>\>\>

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `pluginName` | `string` |
| `isActive` | `boolean` |

#### Returns

`Promise`\<`undefined` \| `Flatten`\<`Merge`\<`Required`\<`object`\>, `OptionalOrUndefined`\<`object`\>\>\>\>

#### Source

[src/ciflex/plugins.ts:55](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/plugins.ts#L55)

***

### hashcode()

> `private` **hashcode**(`str`): `string`

#### Parameters

| Parameter | Type |
| :------ | :------ |
| `str` | `string` |

#### Returns

`string`

#### Source

[src/ciflex/plugins.ts:60](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/plugins.ts#L60)

***

### load()

> **load**(`pluginName`, `isActive`): `Promise`\<`void`\>

#### Parameters

| Parameter | Type | Default value |
| :------ | :------ | :------ |
| `pluginName` | `string` | `undefined` |
| `isActive` | `boolean` | `true` |

#### Returns

`Promise`\<`void`\>

#### Source

[src/ciflex/plugins.ts:40](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/plugins.ts#L40)

***

### init()

> `static` **init**(): [`PluginManager`](PluginManager.md)

#### Returns

[`PluginManager`](PluginManager.md)

#### Source

[src/ciflex/plugins.ts:26](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/plugins.ts#L26)
