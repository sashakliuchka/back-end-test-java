package lessons.lesson4.spoonacullar;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
/**
 * @Author Александр Ключка
 * @created 2022-09-09  17:04
 **/

public class BaseApiTest {

    @BeforeAll
     static void beforeAll() {
        RestAssured.baseURI = "https://api.spoonacular.com";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addQueryParam("apiKey", "0970f5c615f14a2a91942df5a213e41c")
                .build();
    }

   // public String readResourceAsString(String resourceName) {
   //     // ComplexSearchApiTest/resourceName
   //     String path = getClass().getSimpleName() + FileSystems.getDefault().getSeparator() + resourceName;
   //     try (InputStream inputStream = getClass().getResourceAsStream(path)) {
   //         assert inputStream != null;
   //         byte[] data = inputStream.readAllBytes();
   //         return new String(data, StandardCharsets.UTF_8);
   //     } catch (IOException e) {
   //         throw new RuntimeException(e);
   //     }
    // }

}