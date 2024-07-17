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

import loymax.sdk.models.ImageViewModel

import com.squareup.moshi.Json

/**
 * Модель представления для бренда.
 *
 * @param externalId Id.
 * @param uid Uid.
 * @param name Имя.
 * @param images Изображения.
 */

data class BrandHistoryViewModel (

    /* Id. */
    @Json(name = "externalId")
    var externalId: java.util.UUID? = null,

    /* Uid. */
    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    /* Имя. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Изображения. */
    @Json(name = "images")
    var images: kotlin.collections.MutableList<ImageViewModel>? = null

)
