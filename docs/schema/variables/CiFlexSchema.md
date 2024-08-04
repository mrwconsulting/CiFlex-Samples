[**@mrwconsulting/ciflex**](../../README.md) • **Docs**

***

[@mrwconsulting/ciflex](../../README.md) / [schema](../README.md) / CiFlexSchema

# Variable: CiFlexSchema

> `const` **CiFlexSchema**: `object`

## Type declaration

| Member | Type | Value |
| :------ | :------ | :------ |
| `format` | `string` | 'onetable:1.1.0' |
| `indexes` | `object` | ... |
| `indexes.ls1` | `object` | ... |
| `indexes.ls1.project` | `string` | 'all' |
| `indexes.ls1.sort` | `string` | 'id' |
| `indexes.ls1.type` | `string` | 'local' |
| `indexes.primary` | `object` | ... |
| `indexes.primary.hash` | `string` | 'pk' |
| `indexes.primary.sort` | `string` | 'sk' |
| `models` | `object` | ... |
| `models.plugin` | `object` | ... |
| `models.plugin.definition` | `object` | ... |
| `models.plugin.definition.required` | `true` | true |
| `models.plugin.definition.type` | `StringConstructor` | String |
| `models.plugin.description` | `object` | ... |
| `models.plugin.description.type` | `StringConstructor` | String |
| `models.plugin.dockerfile` | `object` | ... |
| `models.plugin.dockerfile.type` | `StringConstructor` | String |
| `models.plugin.id` | `object` | ... |
| `models.plugin.id.generate` | `"ulid"` | 'ulid' |
| `models.plugin.id.type` | `StringConstructor` | String |
| `models.plugin.id.validate` | `RegExp` | ... |
| `models.plugin.image` | `object` | ... |
| `models.plugin.image.default` | `object` | \{\} |
| `models.plugin.image.required` | `true` | true |
| `models.plugin.image.schema` | `object` | ... |
| `models.plugin.image.schema.repository` | `object` | ... |
| `models.plugin.image.schema.repository.required` | `true` | true |
| `models.plugin.image.schema.repository.type` | `StringConstructor` | String |
| `models.plugin.image.schema.tagOrDigest` | `object` | ... |
| `models.plugin.image.schema.tagOrDigest.required` | `true` | true |
| `models.plugin.image.schema.tagOrDigest.type` | `StringConstructor` | String |
| `models.plugin.image.type` | `ObjectConstructor` | Object |
| `models.plugin.isActive` | `object` | ... |
| `models.plugin.isActive.default` | `true` | true |
| `models.plugin.isActive.type` | `BooleanConstructor` | Boolean |
| `models.plugin.metadata` | `object` | ... |
| `models.plugin.metadata.default` | readonly [] | \[\] |
| `models.plugin.metadata.items` | `object` | ... |
| `models.plugin.metadata.items.default` | `object` | \{\} |
| `models.plugin.metadata.items.schema` | `object` | ... |
| `models.plugin.metadata.items.schema.key` | `object` | ... |
| `models.plugin.metadata.items.schema.key.type` | `StringConstructor` | String |
| `models.plugin.metadata.items.schema.value` | `object` | ... |
| `models.plugin.metadata.items.schema.value.type` | `StringConstructor` | String |
| `models.plugin.metadata.items.type` | `ObjectConstructor` | Object |
| `models.plugin.metadata.type` | `ArrayConstructor` | Array |
| `models.plugin.partialBuildSpecFile` | `object` | ... |
| `models.plugin.partialBuildSpecFile.type` | `StringConstructor` | String |
| `models.plugin.pk` | `object` | ... |
| `models.plugin.pk.type` | `StringConstructor` | String |
| `models.plugin.pk.value` | `"PLUGIN:${id}"` | 'PLUGIN:$\{id\}' |
| `models.plugin.pluginName` | `object` | ... |
| `models.plugin.pluginName.required` | `true` | true |
| `models.plugin.pluginName.type` | `StringConstructor` | String |
| `models.plugin.pluginType` | `object` | ... |
| `models.plugin.pluginType.default` | `"CodeBuildStep"` | 'CodeBuildStep' |
| `models.plugin.pluginType.enum` | readonly [`"CodeBuildStep"`, `"ManualApprovalStep"`, `"ShellStep"`] | ... |
| `models.plugin.pluginType.required` | `true` | true |
| `models.plugin.pluginType.type` | `StringConstructor` | String |
| `models.plugin.sk` | `object` | ... |
| `models.plugin.sk.type` | `StringConstructor` | String |
| `models.plugin.sk.value` | `"${pluginType}:${pluginName}"` | '$\{pluginType\}:$\{pluginName\}' |
| `models.plugin.version` | `object` | ... |
| `models.plugin.version.required` | `true` | true |
| `models.plugin.version.type` | `StringConstructor` | String |
| `params` | `object` | ... |
| `params.isoDates` | `boolean` | true |
| `params.timestamps` | `boolean` | true |
| `params.typeField` | `string` | 'model' |
| `version` | `string` | '0.0.1' |

## Source

[src/ciflex/schema.ts:1](https://github.com/mrwconsulting/CiFlex/blob/7abd7b2d63a9c44c1fecf55d7e2f664bb3b1f734/src/ciflex/schema.ts#L1)
