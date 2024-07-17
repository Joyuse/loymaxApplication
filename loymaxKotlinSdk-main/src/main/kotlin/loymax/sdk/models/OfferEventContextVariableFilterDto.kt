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

import loymax.sdk.models.ComparisonOperator
import loymax.sdk.models.OfferEventContextVariable

import com.squareup.moshi.Json

/**
 * Фильтр \"Значение переменной\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param `operator` 
 * @param firstValue Первое значение.
 * @param secondValue Второе значение.
 * @param variable 
 */

data class OfferEventContextVariableFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    @Json(name = "operator")
    var `operator`: ComparisonOperator? = null,

    /* Первое значение. */
    @Json(name = "firstValue")
    var firstValue: kotlin.Double? = null,

    /* Второе значение. */
    @Json(name = "secondValue")
    var secondValue: kotlin.Double? = null,

    @Json(name = "variable")
    var variable: OfferEventContextVariable? = null

)

