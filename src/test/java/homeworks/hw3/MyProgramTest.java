package homeworks.hw3;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @Author Александр Ключка
 * @created 2022-09-05  00:11
 **/

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyProgramTest {

    private static MyProgram myProgram;

    @BeforeAll
    static void beforeAll() {
        myProgram = new MyProgram();
    }

    @Test
    @DisplayName("Базовый сценарий")
    void baseTest() {
        double result = myProgram.getResult(2, 4);
        assertThat(result).isEqualTo(16);
    }
    @Test
    @DisplayName("Проверка на ноль ")
    void badDataTest() {
        assertThatThrownBy(() -> {
            myProgram.getResult(0, 4);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("number could not be empty");
    }
}