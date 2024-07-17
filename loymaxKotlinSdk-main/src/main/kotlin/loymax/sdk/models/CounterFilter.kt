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

import loymax.sdk.models.CounterTarget
import loymax.sdk.models.CounterType
import loymax.sdk.models.OfferEventType

import com.squareup.moshi.Json

/**
 * Фильтр для счетчиков.
 *
 * @param eventType 
 * @param nameText Текст, содержащийся в названии счетчика.
 * @param counterType 
 * @param dateFrom С какой даты искать.
 * @param dateTo По какую дату искать.
 * @param partners Список партнеров, по которым будут отфильтрованы счетчики.
 * @param from Начало выборки.
 * @param count Количество.
 * @param loyaltyProgramIds Список id программ лояльности, для фильтрации счетчиков.
 * @param requiredTargets Обязательные параметры счетчика.
 * @param supportedTargets Поддерживаемые параметры счетчика.
 */

data class CounterFilter (

    @Json(name = "eventType")
    var eventType: OfferEventType? = null,

    /* Текст, содержащийся в названии счетчика. */
    @Json(name = "nameText")
    var nameText: kotlin.String? = null,

    @Json(name = "counterType")
    var counterType: CounterType? = null,

    /* С какой даты искать. */
    @Json(name = "dateFrom")
    var dateFrom: java.time.OffsetDateTime? = null,

    /* По какую дату искать. */
    @Json(name = "dateTo")
    var dateTo: java.time.OffsetDateTime? = null,

    /* Список партнеров, по которым будут отфильтрованы счетчики. */
    @Json(name = "partners")
    var partners: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Начало выборки. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Количество. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Список id программ лояльности, для фильтрации счетчиков. */
    @Json(name = "loyaltyProgramIds")
    var loyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Обязательные параметры счетчика. */
    @Json(name = "requiredTargets")
    var requiredTargets: kotlin.collections.MutableList<CounterTarget>? = null,

    /* Поддерживаемые параметры счетчика. */
    @Json(name = "supportedTargets")
    var supportedTargets: kotlin.collections.MutableList<CounterTarget>? = null

)

