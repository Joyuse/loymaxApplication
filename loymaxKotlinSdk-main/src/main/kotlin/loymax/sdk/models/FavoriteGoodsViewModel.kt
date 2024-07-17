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
 * GoodViewModel.
 *
 * @param id Внутренний идентификатор.
 * @param fromDate Начальная дата периода.
 * @param toDate Конечная дата периода.
 * @param defaultGoodsCount Количество ячеек по умолчанию.
 * @param maxGoodsCount Максимальное количество ячеек.
 * @param partnerId Внутренний идентификатор Партнера.
 * @param codeGood CodeGood.
 * @param barCode BarCode.
 * @param name Name.
 */

data class FavoriteGoodsViewModel (

    /* Внутренний идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Начальная дата периода. */
    @Json(name = "fromDate")
    var fromDate: java.time.OffsetDateTime? = null,

    /* Конечная дата периода. */
    @Json(name = "toDate")
    var toDate: java.time.OffsetDateTime? = null,

    /* Количество ячеек по умолчанию. */
    @Json(name = "defaultGoodsCount")
    var defaultGoodsCount: kotlin.Int? = null,

    /* Максимальное количество ячеек. */
    @Json(name = "maxGoodsCount")
    var maxGoodsCount: kotlin.Int? = null,

    /* Внутренний идентификатор Партнера. */
    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null,

    /* CodeGood. */
    @Json(name = "codeGood")
    var codeGood: kotlin.String? = null,

    /* BarCode. */
    @Json(name = "barCode")
    var barCode: kotlin.String? = null,

    /* Name. */
    @Json(name = "name")
    var name: kotlin.String? = null

)
