package lessons.api.lesson4;

/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:47
 **/
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiUserConnectRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}