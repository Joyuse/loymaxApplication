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

import loymax.sdk.models.CalculationKeyModel
import loymax.sdk.models.GoodsCalculationCashbacksCollectionResponseModel
import loymax.sdk.models.GoodsCalculationDiscountsCollectionResponseModel

import com.squareup.moshi.Json

/**
 * Модель для результат.
 *
 * @param propertyKeys Ключи.
 * @param discount 
 * @param cashback 
 */

data class GoodsCalculationResponseModel (

    /* Ключи. */
    @Json(name = "keys")
    var propertyKeys: kotlin.collections.MutableList<CalculationKeyModel>? = null,

    @Json(name = "discount")
    var discount: GoodsCalculationDiscountsCollectionResponseModel? = null,

    @Json(name = "cashback")
    var cashback: GoodsCalculationCashbacksCollectionResponseModel? = null

)
