package actions;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObject;
import pages.NavigateToURL;
import pages.ProductsPageObject;
import pages.StartBrowser;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortPriceTestSuite {
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

        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        String[] beforeSort_price = new String[prices.size()];

        //Get the prices in to an array
        for(int i=0; i<prices.size(); i++) {
            beforeSort_price[i] = prices.get(i).getText().trim();
        }

        System.out.println("*****Before Sort Function*****");
        Print(beforeSort_price);

        //SortFunction
        Arrays.sort(beforeSort_price);


        System.out.println("*****After the sort by java Sort function*****");
        Print(beforeSort_price);

        productsPageObject.ClickFilterButton();
        Thread.sleep(1000);

        productsPageObject.ClickSelectContainer();
        Thread.sleep(1000);

        productsPageObject.ClickHighToLowOption();
        Thread.sleep(1000);

        driver.findElements(By.className("inventory_item_price"));

        String[] afterSort_price = new String[prices.size()];

        //Get the prices in to an array
        for(int i=0; i<prices.size(); i++) {
            afterSort_price[i] = prices.get(i).getText().trim();
        }

        Assert.assertEquals(afterSort_price,beforeSort_price);
        System.out.println("*****Sort Verified Properly*****");

    }

    public static void Print(String[] pr) {
        for(int i =0 ; i<pr.length;i++) {
            System.out.println(pr[i]);
        }
    }




    @AfterTest

    public void TearDown() {
        driver.close();
        driver.quit();
        System.out.print("Add to cart Page Test run with ");
    }

}






