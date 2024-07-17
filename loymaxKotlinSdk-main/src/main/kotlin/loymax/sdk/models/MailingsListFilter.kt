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

import loymax.sdk.models.MailingWaySendType

import com.squareup.moshi.Json

/**
 * Модель фильтра для списка рассылок.
 *
 * @param fromDate Дата С.
 * @param toDate Дата По.
 * @param from С какого элемента брать.
 * @param count Сколько элементов брать.
 * @param creatorIds Список id создателей акций для фильтрации.
 * @param name Название.
 * @param mailingType 
 * @param marketingCampaignId ID маркетинговой кампании.
 * @param sortByAttachDate Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления.
 * @param loyaltyProgramIds Идентификаторы программ лояльности.
 */

data class MailingsListFilter (

    /* Дата С. */
    @Json(name = "fromDate")
    var fromDate: java.time.OffsetDateTime? = null,

    /* Дата По. */
    @Json(name = "toDate")
    var toDate: java.time.OffsetDateTime? = null,

    /* С какого элемента брать. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Сколько элементов брать. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Список id создателей акций для фильтрации. */
    @Json(name = "creatorIds")
    var creatorIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "mailingType")
    var mailingType: MailingWaySendType? = null,

    /* ID маркетинговой кампании. */
    @Json(name = "marketingCampaignId")
    var marketingCampaignId: kotlin.Int? = null,

    /* Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления. */
    @Json(name = "sortByAttachDate")
    var sortByAttachDate: kotlin.Boolean? = null,

    /* Идентификаторы программ лояльности. */
    @Json(name = "loyaltyProgramIds")
    var loyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null

)
