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
 * Фильтр списка вопросов анкеты.
 *
 * @param onlyRequired True-только вопросы с отмеченным чекбоксом \"Видимый при регистрации\",false-все вопросы.
 */

data class GetQuestionsFilter (

    /* True-только вопросы с отмеченным чекбоксом \"Видимый при регистрации\",false-все вопросы. */
    @Json(name = "onlyRequired")
    var onlyRequired: kotlin.Boolean? = null

)

