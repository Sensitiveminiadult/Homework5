package Examples;

import ChromeRunner.ChromeJava;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Tamara extends ChromeJava {
    @Test
    public void firstTest () {
            $(byName("search_query")).setValue("ტრენინგები").pressEnter();
    }
}
