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

import loymax.sdk.models.DayOfWeek

import com.squareup.moshi.Json

/**
 * Фильтр \"День недели\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param daysOfWeek Дни недели.
 */

data class WeekDayFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Дни недели. */
    @Json(name = "daysOfWeek")
    var daysOfWeek: kotlin.collections.MutableList<DayOfWeek>? = null

)

