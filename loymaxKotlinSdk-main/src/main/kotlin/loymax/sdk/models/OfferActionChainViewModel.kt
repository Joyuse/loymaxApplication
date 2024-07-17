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

import loymax.sdk.models.OfferEventType

import com.squareup.moshi.Json

/**
 * ViewModel цепочки событий.
 *
 * @param id Идентификатор цепочки.
 * @param eventType 
 * @param name Название цепочки.
 * @param order Порядковый номер цепочки.
 * @param parentActionId Ссылка на действие-владельца цепочки.
 */

data class OfferActionChainViewModel (

    /* Идентификатор цепочки. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "eventType")
    var eventType: OfferEventType? = null,

    /* Название цепочки. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Порядковый номер цепочки. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Ссылка на действие-владельца цепочки. */
    @Json(name = "parentActionId")
    var parentActionId: kotlin.Int? = null

)

