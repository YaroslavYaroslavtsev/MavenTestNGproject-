import  io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@Epic("Примеры тестов")
@Feature("Тестовый набор")
public class ExampleTest {

    @Test
    @Story("Тест номер один‚ 1")
    public void testOne() {
        assertThat(true)
                .as("AssertTrue")
                .isTrue();
    }

    @Test
    @Story("Тест номер два‚ 2")
    public void testTwo() {
        step1();
        assertThat(false)
                .as("AssertFalse")
                .isFalse();
    }

    @Step("Шаг промежуточный 1")
    void step1() {
        step2();
    }

    @Step("Шаг промежуточный 2")
    void step2() {
        step3();
    }

    @Step("Шаг промежуточный 3")
    void step3() {

    }

}


