package homeworks.hw4;

/**
 * @Author Александр Ключка
 * @created 2022-09-09  17:05
 **/
import lessons.api.lesson5.ApiSearchResult;
import io.restassured.RestAssured;
import lessons.lesson4.spoonacullar.BaseApiTest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.codehaus.groovy.ast.tools.GeneralUtils.param;
import static org.hamcrest.Matchers.*;

public class TestShoppingList extends BaseApiTest {
    @Order(value = 2)
    @Test
    void AddtoShoppingListTest() {

        ApiSearchResult actually = RestAssured.given()
                .param("username", "your-users-name381")
                .param("hash", "a8e2f6f9298197f64787df396ca398cb7972acb7")
                .log()
                .uri()
                .expect()
                .statusCode(200)
                .time(lessThanOrEqualTo(1700L))
                .body("totalResults", is(384061))
                .body("results[0].title", is("Kale and Quinoa Salad with Black Beans"))
                .log()
                .body()
                .when()
                .get("/mealplanner/{username}/shopping-list/items")
                .body()
                .as(ApiSearchResult.class);

    }
    @Order(value = 1)
    @Test
    void GetShoppingListTest() {

        ApiSearchResult actually = RestAssured.given()
                .param("username", "your-users-name381")
                .param("hash", "a8e2f6f9298197f64787df396ca398cb7972acb7")
                .expect()
                .log()
                .body()
                .when()
                .get("/mealplanner/{username}/shopping-list/items")
                .body()
                .as(ApiSearchResult.class);

    }
    @Test
     @Order(value = 3)
     void deleteItem() {
        ApiSearchResult actually = (ApiSearchResult) RestAssured.given()
                .param("username", "your-users-name381")
                .param("hash", "a8e2f6f9298197f64787df396ca398cb7972acb7")
                .log()
                .uri()
                .expect()
                .statusCode(200)
                .log()
                .body()
                .when()
                .delete("/mealplanner/{username}/shopping-list/items/{id}");
    }









}