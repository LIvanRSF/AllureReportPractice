import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllureTestListener extends BaseTestClass{

    @DisplayName("Тест с Listener Allure")
    @Test
    public void simpleAllureTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Selenide.open("/LIvanRSF/AllureReportPractice");

        $("#issues-tab").click();
        $(byText("Allure test issue")).should(Condition.exist);
    }
}
