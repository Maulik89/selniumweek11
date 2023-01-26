package nopcommerce_testsuite;

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {openBrowser(baseurl);}

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // click on the computers tab
        WebElement ComputersTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        ComputersTab.click();

        // verify the computers text
        WebElement ComputersText=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        String actualText=ComputersText.getText();
        String expectedText="Computers";
        assertEquals(expectedText,actualText);
    }


      @Test
        public void userShouldNavigateToElectronicsPageSuccessfully(){
          // Click on Electronic tab
          WebElement electronicsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
          electronicsTab.click();
          // 2. Verify the 'Electronics' text
          WebElement ElectronicsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
          String actualText = ElectronicsText.getText();
          String expectedText = "Electronics";
          assertEquals(expectedText, actualText);
      }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        // 3. Click on the 'Apparel' tab
        WebElement ApparelTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        ApparelTab.click();

        // 3. Verify the 'Apparel' text
        WebElement ApparelText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText = ApparelText.getText();
        String expectedText = "Apparel";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // 4. Click on the 'Digital downloads' tab
        WebElement DigitalDownloads = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        DigitalDownloads.click();

        // 4. Verify the 'Digital downloads' text
        WebElement DigitalDownloadsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        String actualText = DigitalDownloadsText.getText();
        String expectedText = "Digital downloads";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // 5. Click on the 'Books' tab
        WebElement BooksTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        BooksTab.click();

        // 5. Verify the 'Books' text
        WebElement BooksText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        String actualText = BooksText.getText();
        String expectedText = "Books";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // 6. Click on the 'Jewelry' tab
        WebElement JewelryTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        JewelryTab.click();

        // 6. Verify the 'Jewelry' text
        WebElement JewelryText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        String actualText = JewelryText.getText();
        String expectedText = "Jewelry";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // 7. Click on the 'Gift Cards' tab
        WebElement GiftCards = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        GiftCards.click();

        // 7. Verify the 'Gift Cards' text
        WebElement GiftCardsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        String actualText = GiftCardsText.getText();
        String expectedText = "Gift Cards";
        assertEquals(expectedText, actualText);
    }
    @After
    public void teardown() {
        closeBrowser();
    }




        }





