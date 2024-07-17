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
 * Модель варианта ответа {Loymax.Domain.Contract.Model.Question.FixedAnswers.IFixedAnswer}.
 *
 * @param id Внутренний идентификатор варианта ответа.
 * @param questionId Внутренний идентификатор вопроса.
 * @param isCustom Возможность ввода произвольного ответа (true — да, false — нет).
 * @param order Порядковый номер варианта ответа.
 * @param `value` Значение варианта ответа.
 */

data class FixedAnswerViewModel (

    /* Внутренний идентификатор варианта ответа. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Внутренний идентификатор вопроса. */
    @Json(name = "questionId")
    var questionId: kotlin.Int? = null,

    /* Возможность ввода произвольного ответа (true — да, false — нет). */
    @Json(name = "isCustom")
    var isCustom: kotlin.Boolean? = null,

    /* Порядковый номер варианта ответа. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Значение варианта ответа. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)

