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

import loymax.sdk.models.BatchUploadDataItemModel
import loymax.sdk.models.DeferredOperationState

import com.squareup.moshi.Json

/**
 * Данные.
 *
 * @param propertyValues Значения.
 * @param error Ошибка.
 * @param state 
 * @param resultData Результат операции.
 */

data class BatchUploadDataModel (

    /* Значения. */
    @Json(name = "values")
    var propertyValues: kotlin.collections.MutableList<BatchUploadDataItemModel>? = null,

    /* Ошибка. */
    @Json(name = "error")
    var error: kotlin.String? = null,

    @Json(name = "state")
    var state: DeferredOperationState? = null,

    /* Результат операции. */
    @Json(name = "resultData")
    var resultData: kotlin.String? = null

)
