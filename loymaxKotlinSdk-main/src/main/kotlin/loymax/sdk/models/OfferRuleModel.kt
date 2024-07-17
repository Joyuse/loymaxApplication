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

import loymax.sdk.models.OfferActionChainModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param eventID 
 * @param eventName 
 * @param offerActionChains 
 */

data class OfferRuleModel (

    @Json(name = "eventID")
    var eventID: kotlin.Int? = null,

    @Json(name = "eventName")
    var eventName: kotlin.String? = null,

    @Json(name = "offerActionChains")
    var offerActionChains: kotlin.collections.MutableList<OfferActionChainModel>? = null

)
