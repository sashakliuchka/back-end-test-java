package lessons.api.lesson5;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:55
 **/


public class RetrofitUtils {

    public static <T> T execute(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                try (ResponseBody errorBody = response.errorBody()) {
                    assert errorBody != null;
                    String error = errorBody.string();
                    throw new RuntimeException(error);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}