package pages;

import org.openqa.selenium.WebDriver;

public class URL {
	private WebDriver driver = null;

	public String BASE_URL = "https://www.saucedemo.com/";



	//Used only when swags is UAT
	public String SwagsUrl() {
		// TODO Auto-generated method stub
		return BASE_URL;
	}

	public void launchURL(){
		//URL baseUrl = new URL();
		driver.get(SwagsUrl());
		driver.manage().window().maximize();
	}



}
