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

import loymax.sdk.models.CreatorModel
import loymax.sdk.models.PartnerModel

import com.squareup.moshi.Json

/**
 * ViewModel с информацией о группе товаров.
 *
 * @param id Идентификатор.
 * @param name Название.
 * @param creationDate Дата создания.
 * @param changeDate Дата изменения.
 * @param partner 
 * @param ownerDescription 
 * @param goodsCount Количество товаров.
 * @param lastChangeUserDescription 
 * @param isFixed Зафиксирована или нет.
 * @param fixDate Дата фиксации.
 * @param fixUserDescription 
 * @param fixedGoodsCount Количество зафиксированных товаров.
 * @param isAccepted Принята или нет.
 * @param acceptor 
 * @param isArchived Признак архивной группы товаров.
 * @param externalId Внешний идентификатор.
 */

data class GoodsGroupViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Дата создания. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Дата изменения. */
    @Json(name = "changeDate")
    var changeDate: java.time.OffsetDateTime? = null,

    @Json(name = "partner")
    var partner: PartnerModel? = null,

    @Json(name = "ownerDescription")
    var ownerDescription: CreatorModel? = null,

    /* Количество товаров. */
    @Json(name = "goodsCount")
    var goodsCount: kotlin.Int? = null,

    @Json(name = "lastChangeUserDescription")
    var lastChangeUserDescription: CreatorModel? = null,

    /* Зафиксирована или нет. */
    @Json(name = "isFixed")
    var isFixed: kotlin.Boolean? = null,

    /* Дата фиксации. */
    @Json(name = "fixDate")
    var fixDate: java.time.OffsetDateTime? = null,

    @Json(name = "fixUserDescription")
    var fixUserDescription: CreatorModel? = null,

    /* Количество зафиксированных товаров. */
    @Json(name = "fixedGoodsCount")
    var fixedGoodsCount: kotlin.Int? = null,

    /* Принята или нет. */
    @Json(name = "isAccepted")
    var isAccepted: kotlin.Boolean? = null,

    @Json(name = "acceptor")
    var acceptor: CreatorModel? = null,

    /* Признак архивной группы товаров. */
    @Json(name = "isArchived")
    var isArchived: kotlin.Boolean? = null,

    /* Внешний идентификатор. */
    @Json(name = "externalId")
    var externalId: java.util.UUID? = null

)
