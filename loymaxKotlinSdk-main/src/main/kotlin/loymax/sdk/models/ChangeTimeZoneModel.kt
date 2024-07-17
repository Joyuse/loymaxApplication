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
 * Модель смены часового пояса пользователя.
 *
 * @param timeZone Часовой пояс.
 */

data class ChangeTimeZoneModel (

    /* Часовой пояс. */
    @Json(name = "timeZone")
    var timeZone: kotlin.Int? = null

)

