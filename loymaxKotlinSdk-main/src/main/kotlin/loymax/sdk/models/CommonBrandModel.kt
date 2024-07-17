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

import loymax.sdk.models.BrandModelState
import loymax.sdk.models.ImageViewModel

import com.squareup.moshi.Json

/**
 * Информация о бренде.
 *
 * @param uid Внешний идентификатор бренда.
 * @param name Название бренда.
 * @param description Описание.
 * @param url Адрес сайта бренда.
 * @param images Изображения бренда.
 * @param id Идентификатор.
 * @param code Код.
 * @param mainId Идентификатор.
 * @param order Порядковый номер.
 * @param state 
 */

data class CommonBrandModel (

    /* Внешний идентификатор бренда. */
    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    /* Название бренда. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Адрес сайта бренда. */
    @Json(name = "url")
    var url: kotlin.String? = null,

    /* Изображения бренда. */
    @Json(name = "images")
    var images: kotlin.collections.MutableList<ImageViewModel>? = null,

    /* Идентификатор. */
    @Json(name = "id")
    var id: java.util.UUID? = null,

    /* Код. */
    @Json(name = "code")
    var code: kotlin.String? = null,

    /* Идентификатор. */
    @Json(name = "mainId")
    var mainId: kotlin.Int? = null,

    /* Порядковый номер. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    @Json(name = "state")
    var state: BrandModelState? = null

)
