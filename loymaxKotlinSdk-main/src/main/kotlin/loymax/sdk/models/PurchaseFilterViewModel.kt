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

import loymax.sdk.models.DayOfWeek
import loymax.sdk.models.FilterOperation
import loymax.sdk.models.FilterPurchaseGroupType
import loymax.sdk.models.FixedPurchaseFilterPeriodViewModel
import loymax.sdk.models.FloatingPurchaseFilterPeriodViewModel
import loymax.sdk.models.GoodsGroupViewModel
import loymax.sdk.models.HourMinuteModel
import loymax.sdk.models.MerchantViewModel

import com.squareup.moshi.Json

/**
 * ViewModel для фильтра \"Покупки\".
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param merchants Список выбранных магазинов.
 * @param dateFixedPeriod 
 * @param dateFloatingPeriod 
 * @param daysOfWeek Дни недели покупок.
 * @param beginTime 
 * @param endTime 
 * @param chequeSumOperation 
 * @param chequeSumFirstValue Первое значение суммы чека.
 * @param chequeSumSecondValue Второе значение суммы чека.
 * @param goodsGroups Товары, хотябы один из которых должены присутствовать в чеке.
 * @param filterPositions Фильтровать позиции в соответсвии с выбранными товарами.
 * @param includeCurrentPurchase Включить текущую покупку в расчет, если она удовлетворяет условиям.
 * @param aggregationType 
 * @param operation 
 * @param firstValue Первое значение для сравнения.
 * @param secondValue Второе значение для сравнения.
 */

data class PurchaseFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Список выбранных магазинов. */
    @Json(name = "merchants")
    var merchants: kotlin.collections.MutableList<MerchantViewModel>? = null,

    @Json(name = "dateFixedPeriod")
    var dateFixedPeriod: FixedPurchaseFilterPeriodViewModel? = null,

    @Json(name = "dateFloatingPeriod")
    var dateFloatingPeriod: FloatingPurchaseFilterPeriodViewModel? = null,

    /* Дни недели покупок. */
    @Json(name = "daysOfWeek")
    var daysOfWeek: kotlin.collections.MutableList<DayOfWeek>? = null,

    @Json(name = "beginTime")
    var beginTime: HourMinuteModel? = null,

    @Json(name = "endTime")
    var endTime: HourMinuteModel? = null,

    @Json(name = "chequeSumOperation")
    var chequeSumOperation: FilterOperation? = null,

    /* Первое значение суммы чека. */
    @Json(name = "chequeSumFirstValue")
    var chequeSumFirstValue: kotlin.Double? = null,

    /* Второе значение суммы чека. */
    @Json(name = "chequeSumSecondValue")
    var chequeSumSecondValue: kotlin.Double? = null,

    /* Товары, хотябы один из которых должены присутствовать в чеке. */
    @Json(name = "goodsGroups")
    var goodsGroups: kotlin.collections.MutableList<GoodsGroupViewModel>? = null,

    /* Фильтровать позиции в соответсвии с выбранными товарами. */
    @Json(name = "filterPositions")
    var filterPositions: kotlin.Boolean? = null,

    /* Включить текущую покупку в расчет, если она удовлетворяет условиям. */
    @Json(name = "includeCurrentPurchase")
    var includeCurrentPurchase: kotlin.Boolean? = null,

    @Json(name = "aggregationType")
    var aggregationType: FilterPurchaseGroupType? = null,

    @Json(name = "operation")
    var operation: FilterOperation? = null,

    /* Первое значение для сравнения. */
    @Json(name = "firstValue")
    var firstValue: kotlin.Double? = null,

    /* Второе значение для сравнения. */
    @Json(name = "secondValue")
    var secondValue: kotlin.Double? = null

)
