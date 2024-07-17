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

import loymax.sdk.models.ReferrerInfoViewModel
import loymax.sdk.models.Result
import loymax.sdk.models.ResultModel

import com.squareup.moshi.Json

/**
 * Модель результата с данными.
 *
 * @param result 
 * @param `data` 
 */

data class ResultModelOfReferrerInfoViewModel (

    @Json(name = "result")
    override var result: Result? = null,

    @Json(name = "data")
    var `data`: ReferrerInfoViewModel? = null

) : ResultModel

