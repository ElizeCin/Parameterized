package configuration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass1 {

     public static WebDriver driver;

     @BeforeClass
     public static void beforeParent() {
          driver = WebDriverConfiguration.createDriver(WebDriversEnum.CHROME_INCOGNITO);
     }

     @AfterClass
     public static void afterParent() throws InterruptedException {
          Thread.sleep(3000);
          driver.quit();
     }
}

