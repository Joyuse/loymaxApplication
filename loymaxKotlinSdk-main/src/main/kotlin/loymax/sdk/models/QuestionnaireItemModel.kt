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

import loymax.sdk.models.QuestionnaireItemModelType

import com.squareup.moshi.Json

/**
 * Базовый класс для модели анкеты.
 *
 * @param type 
 */

data class QuestionnaireItemModel (

    @Json(name = "type")
    var type: QuestionnaireItemModelType? = null

)
