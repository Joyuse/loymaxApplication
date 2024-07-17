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

import loymax.sdk.models.DeviceEmulationChequePositionParamType

import com.squareup.moshi.Json

/**
 * Модель параметра чековой позиции или чека.
 *
 * @param parameterType 
 * @param parameterName Название.
 * @param parameterValue Значение.
 */

data class DeviceEmulationPurchaseParamViewModel (

    @Json(name = "parameterType")
    var parameterType: DeviceEmulationChequePositionParamType? = null,

    /* Название. */
    @Json(name = "parameterName")
    var parameterName: kotlin.String? = null,

    /* Значение. */
    @Json(name = "parameterValue")
    var parameterValue: kotlin.String? = null

)

