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

import loymax.sdk.models.NotificationMessageState

import com.squareup.moshi.Json

/**
 * 
 *
 * @param dateFrom 
 * @param dateTo 
 * @param phone 
 * @param state 
 * @param personUid 
 */

data class MessageViberListFilter (

    @Json(name = "dateFrom")
    var dateFrom: java.time.OffsetDateTime? = null,

    @Json(name = "dateTo")
    var dateTo: java.time.OffsetDateTime? = null,

    @Json(name = "phone")
    var phone: kotlin.String? = null,

    @Json(name = "state")
    var state: kotlin.collections.MutableList<NotificationMessageState>? = null,

    @Json(name = "personUid")
    var personUid: java.util.UUID? = null

)

