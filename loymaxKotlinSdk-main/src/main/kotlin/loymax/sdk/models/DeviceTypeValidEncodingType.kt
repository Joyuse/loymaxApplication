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
 * Values: ASCII,CP866,KOI8R,WINDOWS1251,UNICODE,UTF7,UTF8,UTF32
 */

enum class DeviceTypeValidEncodingType(val value: kotlin.String) {

    @Json(name = "ASCII")
    ASCII("ASCII"),

    @Json(name = "Cp866")
    CP866("Cp866"),

    @Json(name = "Koi8r")
    KOI8R("Koi8r"),

    @Json(name = "Windows1251")
    WINDOWS1251("Windows1251"),

    @Json(name = "Unicode")
    UNICODE("Unicode"),

    @Json(name = "UTF7")
    UTF7("UTF7"),

    @Json(name = "UTF8")
    UTF8("UTF8"),

    @Json(name = "UTF32")
    UTF32("UTF32");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DeviceTypeValidEncodingType) "$data" else null

        /**
         * Returns a valid [DeviceTypeValidEncodingType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): DeviceTypeValidEncodingType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
