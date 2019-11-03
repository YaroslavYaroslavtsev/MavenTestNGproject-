import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@Epic("Epic")
@Feature("Feature")
public class ExampleTest {

    @Test
    @Story("РўРµСЃС‚ 1")
    public void testOne() {
        assertThat(true)
                .as("AssertTrue")
                .isTrue();
    }

    @Test
    @Story("РўРµСЃС‚ 2")
    public void testTwo() {
        step1();
        assertThat(false)
                .as("AssertFalse")
                .isFalse();
    }

    @Step("РЁР°Рі 1")
    void step1() {
        step2();
    }

    @Step("РЁР°Рі 2")
    void step2() {
        step3();
    }

    @Step("РЁР°Рі 3")
    void step3() {

    }

}

