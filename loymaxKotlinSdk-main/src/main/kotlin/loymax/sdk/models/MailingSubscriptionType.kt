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
 * Values: CASHBACK,PAYMENT,REFILL,OFFER,SYSTEM,MAILING,REFUND,DEVICE_EMULATION
 */

enum class MailingSubscriptionType(val value: kotlin.String) {

    @Json(name = "Cashback")
    CASHBACK("Cashback"),

    @Json(name = "Payment")
    PAYMENT("Payment"),

    @Json(name = "Refill")
    REFILL("Refill"),

    @Json(name = "Offer")
    OFFER("Offer"),

    @Json(name = "System")
    SYSTEM("System"),

    @Json(name = "Mailing")
    MAILING("Mailing"),

    @Json(name = "Refund")
    REFUND("Refund"),

    @Json(name = "DeviceEmulation")
    DEVICE_EMULATION("DeviceEmulation");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is MailingSubscriptionType) "$data" else null

        /**
         * Returns a valid [MailingSubscriptionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): MailingSubscriptionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
