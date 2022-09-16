import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    @BeforeAll
    static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver"); //for Linux
        //System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe"); //for Windows
    }

    @Test
    @Tag("MyFirstTest")
    public void firstTestCase(){
        System.out.println("FirstTest");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.de");
        driver.quit();
    }

    @Test
    @Tag("MySecondTestcase")
    public void secondTestCase(){
        System.out.println("SecondTest");
    }
}
