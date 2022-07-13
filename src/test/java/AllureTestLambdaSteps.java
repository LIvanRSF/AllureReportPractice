import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllureTestLambdaSteps extends BaseTestClass{

    private final String REPOSITORY = "/LIvanRSF/AllureReportPractice";
    private final String ISSUE_NAME = "Allure test issue";

    @DisplayName("Тест с лямбда шагами Allure")
    @Test
    public void lambdaAllureTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем репозиторий " + REPOSITORY + " в GitHub", () -> {
            Selenide.open(REPOSITORY);
        });
        step("Нажимаем вкладку Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем, что существует issue с наименованием " + ISSUE_NAME, () -> {
            $(byText(ISSUE_NAME)).should(Condition.exist);
        });
    }
}
