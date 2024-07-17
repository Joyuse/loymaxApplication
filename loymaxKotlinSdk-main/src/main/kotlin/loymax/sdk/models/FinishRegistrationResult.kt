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

import loymax.sdk.models.UserActionModel

import com.squareup.moshi.Json

/**
 * Результат окончания регистрации.
 *
 * @param tokenType Тип маркера доступа.
 * @param accessToken Маркер доступа.
 * @param refreshToken Маркер обновления доступа.
 * @param expiresIn Срок действия маркера доступа.
 * @param registrationCompleted Закончена ли регистрация пользователя.
 * @param uncompletedActions Список невыполненых действий клиента.
 * @param authToken Новый токен для зарегистрированного пользователя.
 */

data class FinishRegistrationResult (

    /* Тип маркера доступа. */
    @Json(name = "token_type")
    var tokenType: kotlin.String? = null,

    /* Маркер доступа. */
    @Json(name = "access_token")
    var accessToken: kotlin.String? = null,

    /* Маркер обновления доступа. */
    @Json(name = "refresh_token")
    var refreshToken: kotlin.String? = null,

    /* Срок действия маркера доступа. */
    @Json(name = "expires_in")
    var expiresIn: kotlin.Int? = null,

    /* Закончена ли регистрация пользователя. */
    @Json(name = "registrationCompleted")
    var registrationCompleted: kotlin.Boolean? = null,

    /* Список невыполненых действий клиента. */
    @Json(name = "uncompletedActions")
    var uncompletedActions: kotlin.collections.MutableList<UserActionModel>? = null,

    /* Новый токен для зарегистрированного пользователя. */
    @Json(name = "authToken")
    var authToken: kotlin.String? = null

)

