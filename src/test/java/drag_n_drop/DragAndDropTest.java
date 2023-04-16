package drag_n_drop;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;


public class DragAndDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    //Passed
    @Test
    public void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
    }

    //Failed
    @Test
    public void dragAndDropActions() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
        $("#column-b").shouldHave(text("A"));
    }
}
