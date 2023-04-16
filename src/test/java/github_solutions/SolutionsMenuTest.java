package github_solutions;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;


public class SolutionsMenuTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void solutionsMenuEnterpriseTest() {
        open("https://github.com");

        $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(byText("Build like the best")).shouldBe(visible);


    }
}
