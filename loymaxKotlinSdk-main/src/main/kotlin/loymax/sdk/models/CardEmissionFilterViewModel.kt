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
 * ViewModel для фильтра выпуск карт.
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param emissionIds Выбранные выпуски.
 */

data class CardEmissionFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Выбранные выпуски. */
    @Json(name = "emissionIds")
    var emissionIds: kotlin.collections.MutableList<kotlin.Int>? = null

)
