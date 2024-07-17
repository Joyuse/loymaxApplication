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
 * Сообщение пользователю.
 *
 * @param id Идентификатор оповещения.
 * @param title Заголовок оповещения.
 * @param body Содержимое оповещения.
 * @param summary Краткое содержание оповещения.
 * @param creationDate Дата и время отправки оповещения.
 * @param isReaded Прочитано ли оповещение.
 * @param imageId Идентификатор прикрепленного изображения.
 * @param imageUrl Url прикрепленного изображения.
 */

data class NotificationViewModel (

    /* Идентификатор оповещения. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Заголовок оповещения. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Содержимое оповещения. */
    @Json(name = "body")
    var body: kotlin.String? = null,

    /* Краткое содержание оповещения. */
    @Json(name = "summary")
    var summary: kotlin.String? = null,

    /* Дата и время отправки оповещения. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Прочитано ли оповещение. */
    @Json(name = "isReaded")
    var isReaded: kotlin.Boolean? = null,

    /* Идентификатор прикрепленного изображения. */
    @Json(name = "imageId")
    var imageId: java.util.UUID? = null,

    /* Url прикрепленного изображения. */
    @Json(name = "imageUrl")
    var imageUrl: kotlin.String? = null

)
