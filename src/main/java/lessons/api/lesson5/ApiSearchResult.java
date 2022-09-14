package lessons.api.lesson5;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
/**
 * @Author Александр Ключка
 * @created 2022-09-09  16:52
 **/

// POJO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiSearchResult {
    private List<ApiSearchResultItem> results;
    private Integer offset;
    private Integer number;
    private Integer totalResults;
}