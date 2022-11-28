package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;

public class Google_HomePage {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void TestHomePage() {


        driver.get("https://google.com");
       // Thread.sleep(1000);
        assertEquals(driver.getTitle(),"Google");

      //  Thread.sleep(1000);


    }
}