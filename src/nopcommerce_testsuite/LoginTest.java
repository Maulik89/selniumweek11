package nopcommerce_testsuite;

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully () {
        //click on login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();

        //verify welcome message
        WebElement welcomeMsg = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {
        //click on login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();

        //enter email id in to email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("poi@gmail.com");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123abc");

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

       // verify the logout link
        WebElement logOutLink = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualText = logOutLink.getText();
        String expectedText = "Log out";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test

    public void verifyTheErrorMessage() {

        // Click on the login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();

        //enter email id in to email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("montu89@gmail.com");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Maulik1989");

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        // Verify the error message
        WebElement welcomeMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String split[] = expectedText.split("No", 0);
        System.out.println(split);
        // System.out.println(expectedText.substring(64));
        Assert.assertEquals(expectedText, actualText);
    }

    // close browser
    @After
    public void tearDown() {
        closeBrowser();
    }
}

