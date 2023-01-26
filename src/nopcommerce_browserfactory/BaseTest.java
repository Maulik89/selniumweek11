package nopcommerce_browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;


    public void openBrowser(String baseurl) {
        ChromeOptions options = new ChromeOptions(); // setting Webdriver
        driver = new ChromeDriver(options);
        driver.get(baseurl); // launch the url
        driver.manage().window().maximize();// maximize the browser
        // implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser() {driver.quit();}
}
