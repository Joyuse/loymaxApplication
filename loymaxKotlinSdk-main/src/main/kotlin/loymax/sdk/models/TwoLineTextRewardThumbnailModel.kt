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
 * Модель описания акции, состоящей из двух строк.
 *
 * @param id Идентификатор.
 * @param firstLine Первая строка.
 * @param secondLine Вторая строка.
 */

data class TwoLineTextRewardThumbnailModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Первая строка. */
    @Json(name = "firstLine")
    var firstLine: kotlin.String? = null,

    /* Вторая строка. */
    @Json(name = "secondLine")
    var secondLine: kotlin.String? = null

)

