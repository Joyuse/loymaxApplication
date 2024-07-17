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
 * View-модель маркетинговой кампании.
 *
 * @param id Id.
 * @param name Название.
 * @param partnerId ID партнера.
 * @param isDeleted Значение, определяющее, находится ли кампания в архиве.
 */

data class MarketingCampaignSimpleViewModel (

    /* Id. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* ID партнера. */
    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null,

    /* Значение, определяющее, находится ли кампания в архиве. */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null

)

