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
 * Информация о новом номере телефона.
 *
 * @param phoneNumber Новый номер телефона.
 */

data class NewPhoneNumberInfo (

    /* Новый номер телефона. */
    @Json(name = "phoneNumber")
    var phoneNumber: kotlin.String? = null

)
