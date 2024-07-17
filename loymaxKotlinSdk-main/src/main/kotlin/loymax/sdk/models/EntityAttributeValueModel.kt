/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package loymax.sdk.models


import com.squareup.moshi.Json

/**
 * Модель значения атрибута сущности.
 *
 * @param attributeId Внутренний идентификатор атрибута сущности.
 * @param `value` Значение атрибута.
 */

data class EntityAttributeValueModel (

    /* Внутренний идентификатор атрибута сущности. */
    @Json(name = "attributeId")
    var attributeId: kotlin.Int? = null,

    /* Значение атрибута. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)
