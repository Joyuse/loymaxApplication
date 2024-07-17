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
 * Модель данных для ввода кода подтверждения.
 *
 * @param notifierIdentity Нотификатор (номер телефона/email).
 * @param confirmCode Код подтверждения.
 * @param newPassword Новый пароль.
 */

data class ResetPasswordConfirmModel (

    /* Нотификатор (номер телефона/email). */
    @Json(name = "notifierIdentity")
    var notifierIdentity: kotlin.String? = null,

    /* Код подтверждения. */
    @Json(name = "confirmCode")
    var confirmCode: kotlin.String? = null,

    /* Новый пароль. */
    @Json(name = "newPassword")
    var newPassword: kotlin.String? = null

)

