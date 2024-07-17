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

import loymax.sdk.models.MailingWaySendType
import loymax.sdk.models.PartnerLoyaltyProgramModel

import com.squareup.moshi.Json

/**
 * Модель для рассылки.
 *
 * @param id ID рассылки.
 * @param name Название рассылки.
 * @param creator Создатель рассылки.
 * @param waySendType 
 * @param loyaltyProgram 
 */

data class MailingBriefViewModel (

    /* ID рассылки. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название рассылки. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Создатель рассылки. */
    @Json(name = "creator")
    var creator: kotlin.String? = null,

    @Json(name = "waySendType")
    var waySendType: MailingWaySendType? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: PartnerLoyaltyProgramModel? = null

)

