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

import loymax.sdk.models.LocationDataModel
import loymax.sdk.models.MerchantAdditionalInfoViewModel
import loymax.sdk.models.PaymentLimitViewModel
import loymax.sdk.models.RefundNegativeType

import com.squareup.moshi.Json

/**
 * Модель с информацией о торговой точке.
 *
 * @param id Внутренний идентификатор торговой точки.
 * @param name Название торговой точки.
 * @param internalName Внутреннее название торговой точки.
 * @param guid Uid (устаревший параметр, не использовать).
 * @param uid Внутренний идентификатор торговой точки.
 * @param code Код торговой точки.
 * @param brandId Внутренний идентификатор бренда.
 * @param partnerId Внутренний идентификатор Партнера.
 * @param brandName Название бренда.
 * @param partnerCatalogId Внутренний идентификатор каталога Партнера.
 * @param location 
 * @param isDeleted Признак архивности (true — архивная, false — неархивная).
 * @param url URL сайта торговой точки.
 * @param order Порядковый номер торговой точки.
 * @param description Описание торговой точки.
 * @param schedule График работы торговой точки.
 * @param contacts Контакты торговой точки.
 * @param image Изображение торговой точки.
 * @param refundNegativeType 
 * @param additionalInfo Дополнительная информация о торговой точке.
 * @param paymentLimits The {Loymax.Api.Models.Partner.PaymentLimitViewModel}.
 */

data class MerchantViewModel (

    /* Внутренний идентификатор торговой точки. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название торговой точки. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Внутреннее название торговой точки. */
    @Json(name = "internalName")
    var internalName: kotlin.String? = null,

    /* Uid (устаревший параметр, не использовать). */
    @Json(name = "guid")
    var guid: java.util.UUID? = null,

    /* Внутренний идентификатор торговой точки. */
    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    /* Код торговой точки. */
    @Json(name = "code")
    var code: kotlin.String? = null,

    /* Внутренний идентификатор бренда. */
    @Json(name = "brandId")
    var brandId: kotlin.Int? = null,

    /* Внутренний идентификатор Партнера. */
    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null,

    /* Название бренда. */
    @Json(name = "brandName")
    var brandName: kotlin.String? = null,

    /* Внутренний идентификатор каталога Партнера. */
    @Json(name = "partnerCatalogId")
    var partnerCatalogId: kotlin.Int? = null,

    @Json(name = "location")
    var location: LocationDataModel? = null,

    /* Признак архивности (true — архивная, false — неархивная). */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    /* URL сайта торговой точки. */
    @Json(name = "url")
    var url: kotlin.String? = null,

    /* Порядковый номер торговой точки. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Описание торговой точки. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* График работы торговой точки. */
    @Json(name = "schedule")
    var schedule: kotlin.String? = null,

    /* Контакты торговой точки. */
    @Json(name = "contacts")
    var contacts: kotlin.String? = null,

    /* Изображение торговой точки. */
    @Json(name = "image")
    var image: kotlin.String? = null,

    @Json(name = "refundNegativeType")
    var refundNegativeType: RefundNegativeType? = null,

    /* Дополнительная информация о торговой точке. */
    @Json(name = "additionalInfo")
    var additionalInfo: kotlin.collections.MutableList<MerchantAdditionalInfoViewModel>? = null,

    /* The {Loymax.Api.Models.Partner.PaymentLimitViewModel}. */
    @Json(name = "paymentLimits")
    var paymentLimits: kotlin.collections.MutableList<PaymentLimitViewModel>? = null

)

