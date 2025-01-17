package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface ImageService {
    /**
     * Сохранить изображение.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param fileName Название файла. (optional)
     * @param content Содержимое файла в base64. (optional)
     * @return [Call]<[ResultModelOfGuid]>
     */
    @PUT("v1.2/images")
    fun imageAddImage(@Query("fileName") fileName: kotlin.String? = null, @Query("content") content: kotlin.String? = null): Call<ResultModelOfGuid>

    /**
     * Получить изображение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param imageId Идентификатор изображения.
     * @return [Call]<[ResultModelOfFileViewModel]>
     */
    @GET("v1.2/images/{imageId}")
    suspend fun imageGetImage(@Path("imageId") imageId: kotlin.String): ResultModelOfFileViewModel

    /**
     * Получить изображение с логотипом.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfFileViewModel]>
     */
    @GET("v1.2/images/logo")
    suspend fun imageGetLogo(): ResultModelOfFileViewModel

}
