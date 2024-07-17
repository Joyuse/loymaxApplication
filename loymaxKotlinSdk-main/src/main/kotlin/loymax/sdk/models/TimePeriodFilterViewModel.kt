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

import loymax.sdk.models.HourMinuteModel

import com.squareup.moshi.Json

/**
 * ViewModel для фильтра \"Часы\".
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param beginTime 
 * @param endTime 
 */

data class TimePeriodFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    @Json(name = "beginTime")
    var beginTime: HourMinuteModel? = null,

    @Json(name = "endTime")
    var endTime: HourMinuteModel? = null

)
