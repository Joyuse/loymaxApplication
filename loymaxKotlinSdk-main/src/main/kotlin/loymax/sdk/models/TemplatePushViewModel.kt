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

import loymax.sdk.models.MailingSubscriptionType

import com.squareup.moshi.Json

/**
 * View Model для TemplatePush.
 *
 * @param id Идентификатор.
 * @param logicalName Уникальное логическое имя.
 * @param text Текст.
 * @param weight Вес шаблона.
 * @param subscriptionType 
 * @param isDeleted Флаг удаления.
 * @param canNotBeDeleted Может ли сущность быть удалена.
 * @param allowSendViaTestGateway Будет ли отправляться сообщение через тестовый шлюз.
 * @param header Заголовок.
 * @param shortText Короткий текст.
 */

data class TemplatePushViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Уникальное логическое имя. */
    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null,

    /* Текст. */
    @Json(name = "text")
    var text: kotlin.String? = null,

    /* Вес шаблона. */
    @Json(name = "weight")
    var weight: kotlin.Int? = null,

    @Json(name = "subscriptionType")
    var subscriptionType: MailingSubscriptionType? = null,

    /* Флаг удаления. */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    /* Может ли сущность быть удалена. */
    @Json(name = "canNotBeDeleted")
    var canNotBeDeleted: kotlin.Boolean? = null,

    /* Будет ли отправляться сообщение через тестовый шлюз. */
    @Json(name = "allowSendViaTestGateway")
    var allowSendViaTestGateway: kotlin.Boolean? = null,

    /* Заголовок. */
    @Json(name = "header")
    var header: kotlin.String? = null,

    /* Короткий текст. */
    @Json(name = "shortText")
    var shortText: kotlin.String? = null

)

