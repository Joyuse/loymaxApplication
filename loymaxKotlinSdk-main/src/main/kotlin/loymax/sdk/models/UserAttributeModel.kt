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
 * Модель атрибута клиента.
 *
 * @param logicalName Логическое имя атрибута.
 */

data class UserAttributeModel (

    /* Логическое имя атрибута. */
    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null

)
