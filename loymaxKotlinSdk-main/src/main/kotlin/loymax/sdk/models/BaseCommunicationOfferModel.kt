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

import loymax.sdk.models.FileViewModel
import loymax.sdk.models.ImageViewModel
import loymax.sdk.models.RewardThumbnailModel
import loymax.sdk.models.SimpleCategoryViewModel

import com.squareup.moshi.Json

/**
 * Модель акции, отображаемой клиентам.
 *
 * @param id Идентефикатор.
 * @param title Заголовок.
 * @param description Детальное описание.
 * @param shortDescription Краткое описание.
 * @param begin Дата начала.
 * @param end Дата окончания.
 * @param marketingCampaignId Маркетинговая компания.
 * @param rewardThumbnail 
 * @param images Изображения акции.
 * @param rewardImage 
 * @param merchantIds Список магазинов.
 * @param targetGroupIds Список ЦА.
 * @param isArchived Признак удаления.
 * @param priority Приоритет акции.
 * @param categories Список идентификаторов категорий рекламных материалов.
 */

data class BaseCommunicationOfferModel (

    /* Идентефикатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Заголовок. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Детальное описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Краткое описание. */
    @Json(name = "shortDescription")
    var shortDescription: kotlin.String? = null,

    /* Дата начала. */
    @Json(name = "begin")
    var begin: java.time.OffsetDateTime? = null,

    /* Дата окончания. */
    @Json(name = "end")
    var end: java.time.OffsetDateTime? = null,

    /* Маркетинговая компания. */
    @Json(name = "marketingCampaignId")
    var marketingCampaignId: kotlin.Int? = null,

    @Json(name = "rewardThumbnail")
    var rewardThumbnail: RewardThumbnailModel? = null,

    /* Изображения акции. */
    @Json(name = "images")
    var images: kotlin.collections.MutableList<ImageViewModel>? = null,

    @Json(name = "rewardImage")
    var rewardImage: FileViewModel? = null,

    /* Список магазинов. */
    @Json(name = "merchantIds")
    var merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Список ЦА. */
    @Json(name = "targetGroupIds")
    var targetGroupIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Признак удаления. */
    @Json(name = "isArchived")
    var isArchived: kotlin.Boolean? = null,

    /* Приоритет акции. */
    @Json(name = "priority")
    var priority: kotlin.Int? = null,

    /* Список идентификаторов категорий рекламных материалов. */
    @Json(name = "categories")
    var categories: kotlin.collections.MutableList<SimpleCategoryViewModel>? = null

)

