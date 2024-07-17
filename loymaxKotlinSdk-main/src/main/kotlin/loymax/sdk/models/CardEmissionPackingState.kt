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
 * Values: NOT_PACKED,NOT_REQUIRED,PACKED
 */

enum class CardEmissionPackingState(val value: kotlin.String) {

    @Json(name = "NotPacked")
    NOT_PACKED("NotPacked"),

    @Json(name = "NotRequired")
    NOT_REQUIRED("NotRequired"),

    @Json(name = "Packed")
    PACKED("Packed");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CardEmissionPackingState) "$data" else null

        /**
         * Returns a valid [CardEmissionPackingState] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CardEmissionPackingState? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
