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
 * 
 *
 * @param key 
 * @param `value` 
 */

data class KeyValuePairOfStringAndString (

    @Json(name = "key")
    var key: kotlin.String? = null,

    @Json(name = "value")
    var `value`: kotlin.String? = null

)

