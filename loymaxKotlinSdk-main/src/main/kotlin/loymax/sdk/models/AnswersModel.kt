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

import loymax.sdk.models.QuestionAnswerModel
import loymax.sdk.models.QuestionnaireItemModelType

import com.squareup.moshi.Json

/**
 * Модель набора ответов.
 *
 * @param type 
 * @param number Ид. набора ответов.
 * @param answers Ответы.
 */

data class AnswersModel (

    @Json(name = "type")
    var type: QuestionnaireItemModelType? = null,

    /* Ид. набора ответов. */
    @Json(name = "number")
    var number: kotlin.Int? = null,

    /* Ответы. */
    @Json(name = "answers")
    var answers: kotlin.collections.MutableList<QuestionAnswerModel>? = null

)
