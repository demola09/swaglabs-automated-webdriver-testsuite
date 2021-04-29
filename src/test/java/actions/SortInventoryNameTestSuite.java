package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObject;
import pages.NavigateToURL;
import pages.ProductsPageObject;
import pages.StartBrowser;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortInventoryNameTestSuite {
    private static WebDriver driver = null;

    @BeforeTest
    public void startUp() throws IOException {

        StartBrowser openConnection = new StartBrowser(driver);

        driver = openConnection.initializeBrowser();
    }

    @Test(priority = 1)
    public void InventoryPage() throws InterruptedException {

        NavigateToURL startWebsite = new NavigateToURL(driver);

        startWebsite.launchURL();

        LoginPageObject LoginPageObj = new LoginPageObject(driver);

        LoginPageObj.ClickUsername();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        LoginPageObj.ClearUsername();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        LoginPageObj.EnterUsername("standard_user");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        LoginPageObj.ClickPassword();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        LoginPageObj.ClearPassword();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        LoginPageObj.EnterPassword("secret_sauce");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        LoginPageObj.ClickLoginButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        ProductsPageObject productsPageObject = new ProductsPageObject(driver);

        productsPageObject.VerifyPageIsProductPage();
        Thread.sleep(1000);

        List<WebElement> names = driver.findElements(By.className("inventory_item_name"));

        String[] beforeSort_name = new String[names.size()];

        //Get the prices in to an array
        for(int i=0; i<names.size(); i++) {
            beforeSort_name[i] = names.get(i).getText().trim();
        }
        //SortFunction
        Arrays.sort(beforeSort_name);

        System.out.println("*****After the sort by java sort function*****");
        Print(beforeSort_name);

        productsPageObject.ClickFilterButton();
        Thread.sleep(1000);

        productsPageObject.ClickSelectContainer();
        Thread.sleep(1000);

        productsPageObject.ClickZtoA();
        Thread.sleep(1000);

        driver.findElements(By.className("inventory_item_price"));

        String[] afterSort_name = new String[names.size()];

        //Get the prices in to an array
        for(int i=0; i<names.size(); i++) {
            afterSort_name[i] = names.get(i).getText().trim();
        }

        System.out.println("***After Clicking Sort Button***");
        Print(afterSort_name);

        Assert.assertEquals(afterSort_name,beforeSort_name);
        System.out.println("*****Sort Verified Properly*****");

    }

    public static void Print(String[] pr) {
        for (String s : pr) {
            System.out.println(s);
        }
    }

    @AfterTest

    public void TearDown() {
        driver.close();
        driver.quit();
        System.out.print("Sort Inventory Page Test run with ");
    }

}






