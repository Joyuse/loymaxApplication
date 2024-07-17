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

import loymax.sdk.models.CouponState

import com.squareup.moshi.Json

/**
 * 
 *
 * @param emissionIds 
 * @param couponStates 
 * @param changedStateDateFrom 
 * @param changedStateDateTo 
 * @param couponNumber 
 */

data class CouponListFilter (

    @Json(name = "emissionIds")
    var emissionIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    @Json(name = "couponStates")
    var couponStates: kotlin.collections.MutableList<CouponState>? = null,

    @Json(name = "changedStateDateFrom")
    var changedStateDateFrom: java.time.OffsetDateTime? = null,

    @Json(name = "changedStateDateTo")
    var changedStateDateTo: java.time.OffsetDateTime? = null,

    @Json(name = "couponNumber")
    var couponNumber: kotlin.String? = null

)
