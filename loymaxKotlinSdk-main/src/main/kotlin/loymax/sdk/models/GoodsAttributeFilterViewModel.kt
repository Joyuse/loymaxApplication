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
 * Модель представления фильтра по атрибуту товара.
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param goodsAttributeId Идентификатор атрибута товара.
 */

data class GoodsAttributeFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Идентификатор атрибута товара. */
    @Json(name = "goodsAttributeId")
    var goodsAttributeId: kotlin.Int? = null

)
