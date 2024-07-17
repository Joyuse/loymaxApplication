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

import loymax.sdk.models.HistoryItemOperationType
import loymax.sdk.models.HistoryItemType

import com.squareup.moshi.Json

/**
 * Параметры получения списка истории.
 *
 * @param fromDate Начальная дата периода в формате 0000-00-00T00:00:00Z.
 * @param toDate Конечная дата периода в формате 0000-00-00T00:00:00Z.
 * @param cardId Внутренний идентификатор карты. Возвращает историю только по этой карте.
 * @param from Порядковый номер начального элемента выборки.
 * @param count Количество возвращаемых элементов выборки.
 * @param historyItemType 
 * @param chequeNumber Номер чека.
 * @param operationTypes Типы операций.
 * @param currentUser По текущему клиенту (true), по группе клиентов (false).
 */

data class HistoryFilter (

    /* Начальная дата периода в формате 0000-00-00T00:00:00Z. */
    @Json(name = "fromDate")
    var fromDate: java.time.OffsetDateTime? = null,

    /* Конечная дата периода в формате 0000-00-00T00:00:00Z. */
    @Json(name = "toDate")
    var toDate: java.time.OffsetDateTime? = null,

    /* Внутренний идентификатор карты. Возвращает историю только по этой карте. */
    @Json(name = "cardId")
    var cardId: kotlin.Int? = null,

    /* Порядковый номер начального элемента выборки. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Количество возвращаемых элементов выборки. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    @Json(name = "historyItemType")
    var historyItemType: HistoryItemType? = null,

    /* Номер чека. */
    @Json(name = "chequeNumber")
    var chequeNumber: kotlin.String? = null,

    /* Типы операций. */
    @Json(name = "operationTypes")
    var operationTypes: kotlin.collections.MutableList<HistoryItemOperationType>? = null,

    /* По текущему клиенту (true), по группе клиентов (false). */
    @Json(name = "currentUser")
    var currentUser: kotlin.Boolean? = null

)
