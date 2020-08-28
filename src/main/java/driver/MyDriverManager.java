package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriverManager {
    public static WebDriver getWebDriver(String expectedDriver) {
        WebDriver driver = null;
        if (expectedDriver.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (expectedDriver.equals("ie")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Please define expected driver using next words:'chrome','ie' ");
        }
        return driver;
    }
}
