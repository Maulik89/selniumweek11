package orangehrm_testsuite;

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ForgotPasswoedTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //Click on the "Forgot Your Password Link"4
        WebElement Forgotyourpassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        Forgotyourpassword.click();

        // Verify the text 'Forgot Ypur Password'
        WebElement ForgotyourpasswordText = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String actualText = ForgotyourpasswordText.getText();
        String expectedText = "Forgot your password";
        assertEquals(expectedText, actualText);
    }


        @After
        public void teardown() {
            closeBrowser();
        }


    }


