package homeworks.hw4;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.BeforeAll;

/**
 * @Author Александр Ключка
 * @created 2022-09-11  14:32
 **/
public class BaseApiTest {

    @BeforeAll
    static void beforeAll() {
        RestAssured.baseURI = "https://api.spoonacular.com";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addQueryParam("apiKey", "ce0a0eaf7a0e49f6948fe4213a97a52e")
                .build();
    }
}