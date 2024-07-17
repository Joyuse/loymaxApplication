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
 * Период очищения ячейки персональных товаров.
 *
 * Values: DO_NOT_CLEAR,DAY,WEEK,MONTH,PERIOD
 */

enum class PeriodClearCell(val value: kotlin.String) {

    @Json(name = "DoNotClear")
    DO_NOT_CLEAR("DoNotClear"),

    @Json(name = "Day")
    DAY("Day"),

    @Json(name = "Week")
    WEEK("Week"),

    @Json(name = "Month")
    MONTH("Month"),

    @Json(name = "Period")
    PERIOD("Period");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is PeriodClearCell) "$data" else null

        /**
         * Returns a valid [PeriodClearCell] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): PeriodClearCell? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
