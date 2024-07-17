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

import loymax.sdk.models.OfferDraftState
import loymax.sdk.models.OfferViewState

import com.squareup.moshi.Json

/**
 * Модель для версий акции.
 *
 * @param id ID версии акции.
 * @param name Название версии акции.
 * @param beginTime Время начала версии акции.
 * @param endTime Дата окончания действия версии акции. Если это пустое значение, то версия акция действует бесконечно долго, начиная с BeginTime.
 * @param creationDate Дата создания версии акции.
 * @param lastChangeDate Дата последних изменений версии акции.
 * @param lastChangeUser Пользователь, который последним изменял версию акции.
 * @param description Описание версии акции.
 * @param isSum Является ли версия акции суммируемой.
 * @param priority Приоритет версии акции.
 * @param isDraft Является ли черновиком.
 * @param isDefault Является ли акция базовой (по умолчанию).
 * @param draftState 
 * @param viewState 
 * @param draftRejectReason Причина отклонения версии как черновика акции.
 * @param isStopped Остановлена ли версия.
 */

data class OfferVersionsViewModel (

    /* ID версии акции. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название версии акции. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Время начала версии акции. */
    @Json(name = "beginTime")
    var beginTime: java.time.OffsetDateTime? = null,

    /* Дата окончания действия версии акции. Если это пустое значение, то версия акция действует бесконечно долго, начиная с BeginTime. */
    @Json(name = "endTime")
    var endTime: java.time.OffsetDateTime? = null,

    /* Дата создания версии акции. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Дата последних изменений версии акции. */
    @Json(name = "lastChangeDate")
    var lastChangeDate: java.time.OffsetDateTime? = null,

    /* Пользователь, который последним изменял версию акции. */
    @Json(name = "lastChangeUser")
    var lastChangeUser: kotlin.String? = null,

    /* Описание версии акции. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Является ли версия акции суммируемой. */
    @Json(name = "isSum")
    var isSum: kotlin.Boolean? = null,

    /* Приоритет версии акции. */
    @Json(name = "priority")
    var priority: kotlin.Int? = null,

    /* Является ли черновиком. */
    @Json(name = "isDraft")
    var isDraft: kotlin.Boolean? = null,

    /* Является ли акция базовой (по умолчанию). */
    @Json(name = "isDefault")
    var isDefault: kotlin.Boolean? = null,

    @Json(name = "draftState")
    var draftState: OfferDraftState? = null,

    @Json(name = "viewState")
    var viewState: OfferViewState? = null,

    /* Причина отклонения версии как черновика акции. */
    @Json(name = "draftRejectReason")
    var draftRejectReason: kotlin.String? = null,

    /* Остановлена ли версия. */
    @Json(name = "isStopped")
    var isStopped: kotlin.Boolean? = null

)

