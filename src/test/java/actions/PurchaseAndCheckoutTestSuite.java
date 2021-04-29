package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObject;
import pages.NavigateToURL;
import pages.ProductsPageObject;
import pages.StartBrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PurchaseAndCheckoutTestSuite {
    private static WebDriver driver = null;

    @BeforeTest
    public void startUp() throws IOException {

        StartBrowser openConnection = new StartBrowser(driver);

        driver = openConnection.initializeBrowser();
    }

    @Test(priority = 1)
    public void AddBackPack() throws InterruptedException {

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

        productsPageObject.ClickSauceBackPack();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        //productsPageObject.VerifyPriceIsPresent();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickAddToCartButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickCartIcon();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.VerifyPageIsCartPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.VerifyItemIsPresentOnCartPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickCheckOutButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.VerifyPageIsCheckOutPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickFirstName();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClearFirstName();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.EnterFirstName("Ademola");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickLastName();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClearLastName();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.EnterLastName("Adelekan");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickZipCode();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClearZipCode();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.EnterZipCode("123456");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickContinueButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.VerifyPageIsCheckOutOverview();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.ClickFinishButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        productsPageObject.VerifyPurchaseWasSuccessful();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        LoginPageObj.ClickMenuButton();

        LoginPageObj.ClickLogoutButton();


    }




    @AfterTest

    public void TearDown() {
        driver.close();
        driver.quit();
        System.out.print("Purchase and Checkout Page Test run with ");
    }

}






