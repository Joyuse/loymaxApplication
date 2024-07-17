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
 * Атрибут предупреждения.
 *
 * @param name Имя атрибута.
 * @param `value` Значение атрибута.
 */

data class ImportWarningAttribute (

    /* Имя атрибута. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Значение атрибута. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)
