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

import loymax.sdk.models.OfferResponseModel

import com.squareup.moshi.Json

/**
 * Модель ответа с информацией о чековой позиции (с результатами расчета).
 *
 * @param position Уникальный номер позиции в чеке.
 * @param amount Сумма позиции после применения внешней/кассовой скидки.
 * @param goodsId Код товара по каталогу Партнера.
 * @param barcode Штрихкод товара.
 * @param quantity Количество товара/вес.
 * @param cashback Сумма кешбэка на позицию.
 * @param discount Размер прямой скидки, предоставляемой по карте.
 * @param appliedOffers Список сработавших акций.
 * @param payAmount Сумма списания бонусов.
 * @param message Комментарий.
 */

data class ChequeLineResponseModel (

    /* Уникальный номер позиции в чеке. */
    @Json(name = "position")
    var position: kotlin.Int? = null,

    /* Сумма позиции после применения внешней/кассовой скидки. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Код товара по каталогу Партнера. */
    @Json(name = "goodsId")
    var goodsId: kotlin.String? = null,

    /* Штрихкод товара. */
    @Json(name = "barcode")
    var barcode: kotlin.String? = null,

    /* Количество товара/вес. */
    @Json(name = "quantity")
    var quantity: kotlin.Double? = null,

    /* Сумма кешбэка на позицию. */
    @Json(name = "cashback")
    var cashback: kotlin.Double? = null,

    /* Размер прямой скидки, предоставляемой по карте. */
    @Json(name = "discount")
    var discount: kotlin.Double? = null,

    /* Список сработавших акций. */
    @Json(name = "appliedOffers")
    var appliedOffers: kotlin.collections.MutableList<OfferResponseModel>? = null,

    /* Сумма списания бонусов. */
    @Json(name = "payAmount")
    var payAmount: kotlin.Double? = null,

    /* Комментарий. */
    @Json(name = "message")
    var message: kotlin.String? = null

)

