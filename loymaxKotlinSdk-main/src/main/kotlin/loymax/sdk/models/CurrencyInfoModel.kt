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

import loymax.sdk.models.NameCaseModel

import com.squareup.moshi.Json

/**
 * Модель подробной информации о валюте.
 *
 * @param id Внутренний идентификатор валюты.
 * @param name Название валюты.
 * @param code Код валюты.
 * @param uid Внешний идентификатор валюты.
 * @param externalId Параметр не используется, необходимо оставлять значение по умолчанию.
 * @param imageId Внутренний идентификатор изображения валюты.
 * @param description Описание валюты.
 * @param isDeleted Признак состояния валюты (true — архивная, false — неархивная).
 * @param nameCases 
 */

data class CurrencyInfoModel (

    /* Внутренний идентификатор валюты. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название валюты. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Код валюты. */
    @Json(name = "code")
    var code: kotlin.String? = null,

    /* Внешний идентификатор валюты. */
    @Json(name = "uid")
    var uid: kotlin.String? = null,

    /* Параметр не используется, необходимо оставлять значение по умолчанию. */
    @Json(name = "externalId")
    var externalId: kotlin.String? = null,

    /* Внутренний идентификатор изображения валюты. */
    @Json(name = "imageId")
    var imageId: java.util.UUID? = null,

    /* Описание валюты. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Признак состояния валюты (true — архивная, false — неархивная). */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    @Json(name = "nameCases")
    var nameCases: NameCaseModel? = null

)

