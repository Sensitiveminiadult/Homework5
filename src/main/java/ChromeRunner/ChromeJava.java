package ChromeRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.nio.channels.ConnectionPendingException;

import static com.codeborne.selenide.Selenide.open;

public class ChromeJava {
    @BeforeTest
    public static void setUp(){
        Configuration.browser = "chrome";
        open ("https://www.youtube.com");
    }
    @AfterTest
    public static void tearDown (){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}

