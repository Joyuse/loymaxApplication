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
 * Связанный партнер с акцией.
 *
 * @param id Внутренный идентификатор партнера.
 * @param name Название партнера.
 */

data class RelatedPartner (

    /* Внутренный идентификатор партнера. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название партнера. */
    @Json(name = "name")
    var name: kotlin.String? = null

)

