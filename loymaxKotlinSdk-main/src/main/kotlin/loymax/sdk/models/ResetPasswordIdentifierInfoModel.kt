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

import loymax.sdk.models.NotifierType

import com.squareup.moshi.Json

/**
 * Модель для поиска вариантов для восстановления пароля.
 *
 * @param identifierType 
 * @param identifier Идентификатор для восстановления (номер телефона/адрес email).
 * @param text Описание идетификатора.
 */

data class ResetPasswordIdentifierInfoModel (

    @Json(name = "identifierType")
    var identifierType: NotifierType? = null,

    /* Идентификатор для восстановления (номер телефона/адрес email). */
    @Json(name = "identifier")
    var identifier: kotlin.String? = null,

    /* Описание идетификатора. */
    @Json(name = "text")
    var text: kotlin.String? = null

)
