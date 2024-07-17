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

import loymax.sdk.models.OfferActionsChainDto

import com.squareup.moshi.Json

/**
 * Удаление пользователем активности в социальных сетях.
 *
 * @param chains Цепочки действий для обработки события.
 */

data class RemoveSocialActivityEventDto (

    /* Цепочки действий для обработки события. */
    @Json(name = "chains")
    var chains: kotlin.collections.MutableList<OfferActionsChainDto>? = null

)

