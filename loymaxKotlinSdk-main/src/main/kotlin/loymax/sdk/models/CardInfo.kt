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

import loymax.sdk.models.CardActionAccessInfo
import loymax.sdk.models.CardCategoryInfoBriefModel
import loymax.sdk.models.CardState
import loymax.sdk.models.MoneyViewModel
import loymax.sdk.models.UserInfoBase

import com.squareup.moshi.Json

/**
 * Информация о карте.
 *
 * @param id Ифентификатор.
 * @param state 
 * @param number Номер карты.
 * @param barCode Баркод.
 * @param block Заблокирована или нет.
 * @param expiryDate Дата истечения карты.
 * @param cardCategory 
 * @param cardOwnerInfo 
 * @param accumulated 
 * @param paid 
 * @param accumulatedInfo Информация о полученных средствах.
 * @param paidInfo Информация о потраченных средствах.
 * @param cardActionAccessInfo 
 */

data class CardInfo (

    /* Ифентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "state")
    var state: CardState? = null,

    /* Номер карты. */
    @Json(name = "number")
    var number: kotlin.String? = null,

    /* Баркод. */
    @Json(name = "barCode")
    var barCode: kotlin.String? = null,

    /* Заблокирована или нет. */
    @Json(name = "block")
    var block: kotlin.Boolean? = null,

    /* Дата истечения карты. */
    @Json(name = "expiryDate")
    var expiryDate: java.time.OffsetDateTime? = null,

    @Json(name = "cardCategory")
    var cardCategory: CardCategoryInfoBriefModel? = null,

    @Json(name = "cardOwnerInfo")
    var cardOwnerInfo: UserInfoBase? = null,

    @Json(name = "accumulated")
    var accumulated: MoneyViewModel? = null,

    @Json(name = "paid")
    var paid: MoneyViewModel? = null,

    /* Информация о полученных средствах. */
    @Json(name = "accumulatedInfo")
    var accumulatedInfo: kotlin.collections.MutableList<MoneyViewModel>? = null,

    /* Информация о потраченных средствах. */
    @Json(name = "paidInfo")
    var paidInfo: kotlin.collections.MutableList<MoneyViewModel>? = null,

    @Json(name = "cardActionAccessInfo")
    var cardActionAccessInfo: CardActionAccessInfo? = null

)

