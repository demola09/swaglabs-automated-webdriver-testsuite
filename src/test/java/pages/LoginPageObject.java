package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");
	By Menu = By.xpath("//button[@id='react-burger-menu-btn']");
	By logout = By.xpath("//a[@id='logout_sidebar_link']");



	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickUsername() {

		try{
			driver.findElement(username).click();

			System.out.println("Username input field was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void ClearUsername() {

		try{
			driver.findElement(username).clear();

			System.out.println("Username input field was Cleared");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterUsername(String text){

		try{
			driver.findElement(username).sendKeys(text);

			System.out.println("Username was Entered successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickPassword() {
		try{
			driver.findElement(password).sendKeys();
			System.out.println("Password input field was Clicked");
		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearPassword() {
		try{
			driver.findElement(password).sendKeys();
			System.out.println("Password input field was Cleared");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterPassword(String text){

		try{
			driver.findElement(password).sendKeys(text);

			System.out.println("Password was Entered successfully");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClickLoginButton() {
		try{
			driver.findElement(loginButton).click();
			System.out.println("Login Button was Clicked");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickMenuButton() {
		try{
			driver.findElement(Menu).click();
			System.out.println("Hamburger Menu was Clicked");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLogoutButton() {
		try{
			driver.findElement(logout).click();
			System.out.println("Logout Button was Clicked");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}







