package lessons.api.lesson5;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:54
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiSearchResultItem {
    private Long id;
    private String title;
    private String image;
    private String imageType;
}