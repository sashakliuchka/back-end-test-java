package lessons.api.lesson5;
import lessons.api.lesson4.ApiUserConnectRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:56
 **/


public interface SpoonaccularApi {

    @GET("/recipes/complexSearch")
    Call<ApiSearchResult> findRecipes(
            @Query("apiKey") String apiKey,
            @Query("query") String query,
            @Query("number") Integer number
    );

    @POST("/users/connect")
    Call<ApiUserConnectResult> connect(@Body ApiUserConnectRequest request, @Query("apiKey") String apiKey);

}