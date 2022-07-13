import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class WebSteps {

    @Step("Открываем репозиторий {repository} в GitHub")
    public void openRepository(String repository) {
        Selenide.open("/LIvanRSF/AllureReportPractice");
    }

    @Step("Нажимаем вкладку Issues")
    public void openIssueTab() {
        $("#issues-tab").click();
    }

    @Step("Проверяем, что существует issue с наименованием {issueName}")
    public void shoudBeIssueWithName(String issueName) {
        $(byText("Allure test issue")).should(Condition.exist);
    }
}
