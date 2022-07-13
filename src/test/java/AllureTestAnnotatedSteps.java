import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllureTestAnnotatedSteps extends BaseTestClass{

    private final String REPOSITORY = "/LIvanRSF/AllureReportPractice";
    private final String ISSUE_NAME = "Allure test issue";

    @DisplayName("Тест с лямбда шагами Allure")
    @Test
    public void lambdaAllureTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shoudBeIssueWithName(ISSUE_NAME);
    }
}
