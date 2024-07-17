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

import loymax.sdk.models.CityData

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param locationId 
 * @param latitude 
 * @param longitude 
 * @param city 
 * @param street 
 * @param house 
 * @param building 
 * @param office 
 * @param addressDescription 
 */

data class LocationData (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "locationId")
    var locationId: java.util.UUID? = null,

    @Json(name = "latitude")
    var latitude: kotlin.Double? = null,

    @Json(name = "longitude")
    var longitude: kotlin.Double? = null,

    @Json(name = "city")
    var city: CityData? = null,

    @Json(name = "street")
    var street: kotlin.String? = null,

    @Json(name = "house")
    var house: kotlin.String? = null,

    @Json(name = "building")
    var building: kotlin.String? = null,

    @Json(name = "office")
    var office: kotlin.String? = null,

    @Json(name = "addressDescription")
    var addressDescription: kotlin.String? = null

)

