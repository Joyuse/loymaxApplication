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
 * Партнерский идентификатор товара для персонального предложения.
 *
 * @param `value` Значение идентификатора.
 */

data class PersonalOfferGoodsPartnerCodeViewModel (

    /* Значение идентификатора. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)
