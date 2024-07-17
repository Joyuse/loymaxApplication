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
 * Действие акции \"Установка минимальной цены\".
 *
 * @param order Порядковый номер действия в цепочке.
 * @param id Id действия в цепочке.
 * @param percent Процент.
 * @param fixedAmount Фиксированная сумма.
 * @param fixedPrice Фиксированная сумма на каждую единицу товара.
 * @param catalogAttributeId Id атрибута, содержащий значение ограничения.
 */

data class MinPriceActionDto (

    /* Порядковый номер действия в цепочке. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Id действия в цепочке. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Процент. */
    @Json(name = "percent")
    var percent: kotlin.Double? = null,

    /* Фиксированная сумма. */
    @Json(name = "fixedAmount")
    var fixedAmount: kotlin.Double? = null,

    /* Фиксированная сумма на каждую единицу товара. */
    @Json(name = "fixedPrice")
    var fixedPrice: kotlin.Double? = null,

    /* Id атрибута, содержащий значение ограничения. */
    @Json(name = "catalogAttributeId")
    var catalogAttributeId: kotlin.Int? = null

)
