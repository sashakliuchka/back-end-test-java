package lessons.api.lesson4;

/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:46
 **/
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import retrofit2.http.Body;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiAddToShoppingListRequest {
    private String item;
    private String aisle;
    private Boolean parse;
}
