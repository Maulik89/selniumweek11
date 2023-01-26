package orangehrm_testsuite;

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        //Enter "Admin" username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Enter password "admin123"
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //Click on login button
        WebElement loginbutton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        loginbutton.click();

        // Verify the "Welcome' text is display

        WebElement welcomeText = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
        String ActualText = welcomeText.getText();
        String ExpectedText = "Dashboard";
        assertEquals(ExpectedText,ActualText);



    }
    @After
    public void closeBrowser() {
        driver.quit();
}


}
