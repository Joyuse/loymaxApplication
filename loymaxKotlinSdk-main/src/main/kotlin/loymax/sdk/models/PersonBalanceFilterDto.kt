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
import loymax.sdk.models.PersonBalanceTypeFilter

import com.squareup.moshi.Json

/**
 * Фильтр по статусной системе.
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param `operator` 
 * @param firstValue Первое значение.
 * @param secondValue Второе значение.
 * @param balanceType 
 * @param currencyUid Uid валюты.
 * @param currencyExternalId Для совместимости, использовать CurrencyUid: Uid валюты.
 */

data class PersonBalanceFilterDto (

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

    @Json(name = "balanceType")
    var balanceType: PersonBalanceTypeFilter? = null,

    /* Uid валюты. */
    @Json(name = "currencyUid")
    var currencyUid: kotlin.String? = null,

    /* Для совместимости, использовать CurrencyUid: Uid валюты. */
    @Json(name = "currencyExternalId")
    var currencyExternalId: kotlin.String? = null

)
