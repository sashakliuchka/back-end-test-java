package lessons.api.lesson5;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:55
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiUserConnectResult {
    private String status;
    private String username;
    private String spoonacularPassword;
    private String hash;
}