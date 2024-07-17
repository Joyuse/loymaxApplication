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
 * Ошибка при ответе на вопрос.
 *
 * @param idQuestion Идентификатор вопроса.
 * @param errors Набор ошибок.
 */

data class QuestionError (

    /* Идентификатор вопроса. */
    @Json(name = "idQuestion")
    var idQuestion: kotlin.String? = null,

    /* Набор ошибок. */
    @Json(name = "errors")
    var errors: kotlin.collections.MutableList<kotlin.String>? = null

)
