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

import loymax.sdk.models.ItemData

import com.squareup.moshi.Json

/**
 * 
 *
 * @param chequeLinePosId 
 * @param `data` 
 */

data class GiftCertificate (

    @Json(name = "chequeLinePosId")
    var chequeLinePosId: kotlin.String? = null,

    @Json(name = "data")
    var `data`: kotlin.collections.MutableList<ItemData>? = null

)

