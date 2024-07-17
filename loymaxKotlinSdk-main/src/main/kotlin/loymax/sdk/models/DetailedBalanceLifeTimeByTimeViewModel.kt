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
 * Дата активаций/сгораний бонусов.
 *
 * @param amount Количество бонусов.
 * @param date Дата активации/сгорания.
 */

data class DetailedBalanceLifeTimeByTimeViewModel (

    /* Количество бонусов. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Дата активации/сгорания. */
    @Json(name = "date")
    var date: java.time.OffsetDateTime? = null

)
