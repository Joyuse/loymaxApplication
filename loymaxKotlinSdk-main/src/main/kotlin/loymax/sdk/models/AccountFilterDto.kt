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
 * Фильтр \"Наличие счета\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param accountExists Существует счет или нет.
 */

data class AccountFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Существует счет или нет. */
    @Json(name = "accountExists")
    var accountExists: kotlin.Boolean? = null

)
