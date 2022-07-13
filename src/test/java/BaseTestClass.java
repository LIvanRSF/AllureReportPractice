import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestClass {

    @BeforeAll
    public static void setUpAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }
}
