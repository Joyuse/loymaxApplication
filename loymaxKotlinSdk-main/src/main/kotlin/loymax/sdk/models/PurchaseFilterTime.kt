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
 * Время покупок.
 *
 * @param beginHour Часы начала.
 * @param beginMinute Минуты начала.
 * @param endHour Часы окончания.
 * @param endMinute Минуты окончания.
 */

data class PurchaseFilterTime (

    /* Часы начала. */
    @Json(name = "beginHour")
    var beginHour: kotlin.Int? = null,

    /* Минуты начала. */
    @Json(name = "beginMinute")
    var beginMinute: kotlin.Int? = null,

    /* Часы окончания. */
    @Json(name = "endHour")
    var endHour: kotlin.Int? = null,

    /* Минуты окончания. */
    @Json(name = "endMinute")
    var endMinute: kotlin.Int? = null

)

