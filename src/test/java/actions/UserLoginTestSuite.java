package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObject;
import pages.NavigateToURL;
import pages.StartBrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UserLoginTestSuite {
	private static WebDriver driver = null;

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void ValidUsernameValidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickUsername();

		LoginPageObj.ClearUsername();

		LoginPageObj.EnterUsername("standard_user");

		LoginPageObj.ClickPassword();

		LoginPageObj.ClearPassword();

		LoginPageObj.EnterPassword("secret_sauce");

		LoginPageObj.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		
		
		
	}
	
	@Test(priority = 2)
	public void ValidUsernameInvalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickUsername();

		LoginPageObj.ClearUsername();

		LoginPageObj.EnterUsername("standard_user");

		LoginPageObj.ClickPassword();

		LoginPageObj.ClearPassword();

		LoginPageObj.EnterPassword("secret");

		LoginPageObj.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		
		
	}
	
	@Test(priority = 3)
	public void InValidUsernameInvalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickUsername();

		LoginPageObj.ClearUsername();

		LoginPageObj.EnterUsername("user");

		LoginPageObj.ClickPassword();

		LoginPageObj.ClearPassword();

		LoginPageObj.EnterPassword("secret");

		LoginPageObj.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		
		
	}
	
	@Test(priority = 4)
	public void InValidUsernameValidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickUsername();

		LoginPageObj.ClearUsername();

		LoginPageObj.EnterUsername("user");

		LoginPageObj.ClickPassword();

		LoginPageObj.ClearPassword();

		LoginPageObj.EnterPassword("secret_sauce");

		LoginPageObj.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		
		
	}

	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Login Page Test run with ");
	}

}






