package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPageObject {


	private By ProductsPage = By.xpath("//span[contains(text(),'Products')]");
	private By SauceBackPack = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	private By SauceLabsBike =  By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]");
	private By SauceLabsTShirt =  By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]");
	private By SauceLabsFleeceJacket =  By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]");
	private By SauceLabsOnesie =  By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");
	private By SauceLabsTshirtRed =  By.xpath("//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]");
	private By AddToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By BackPackPrice = By.xpath("//div[contains(text(),'29.99')]");
	private By RemoveFromCart = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	private By CartIcon = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");
	private By CartPage = By.xpath("//span[contains(text(),'Your Cart')]");
	private By CartItem = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	private By CheckOut = By.xpath("//button[@id='checkout']");
	private By CheckOutPage = By.xpath("//span[contains(text(),'Checkout: Your Information')]");
	private By firstName = By.xpath("//input[@id='first-name']");
	private By lastName = By.xpath("//input[@id='last-name']");
	private By zipCode = By.xpath("//input[@id='postal-code']");
	private By continueButton = By.xpath("//input[@id='continue']");
	private By checkoutOverview = By.xpath("//span[contains(text(),'Checkout: Overview')]");
	private By finishButton = By.xpath("//button[@id='finish']");
	private By purchaseSuccess = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");
	private By SortFilterButton = By.className("select_container");
	private By SortingOption = By.className("product_sort_container");






	private WebDriver driver;

	public ProductsPageObject(WebDriver driver) {
		this.driver = driver;
	}


	public void VerifyPageIsProductPage() {

		try{
			driver.findElement(ProductsPage).isDisplayed();

			System.out.println("Page is Product Page");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void ClickSauceBackPack() {

		try{
			driver.findElement(SauceBackPack).click();

			System.out.println("Sauce Back Pack was Clicked");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClickAddToCartButton() {
		try {
			driver.findElement(AddToCartButton).click();

			System.out.println("Add To Cart Button is clickable");
		}catch (Exception e){
			throw new RuntimeException(e.getMessage());
		}

	}


	public void VerifyPriceIsPresent() {
		
		try {
			driver.findElement(BackPackPrice).isDisplayed();
			System.out.println("Back Pack Price 29.99");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClickCartIcon(){

		try{
			driver.findElement(CartIcon).click();

			System.out.println("Cart Icon was clicked successfully");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void RemoveCartItem(){

		try{
			driver.findElement(RemoveFromCart).click();

			System.out.println("Cart Icon was removed successfully");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void VerifyPageIsCartPage(){

		try{
			driver.findElement(CartPage).isDisplayed();

			System.out.println("Page displayed is cart Page");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void VerifyItemIsPresentOnCartPage() {

		try {
			driver.findElement(CartItem).isDisplayed();
			System.out.println("Cart Item is present on cart page");
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifySauceLabsBikeItemIsPresent() {

		try{
			driver.findElement(SauceLabsBike).isDisplayed();

			System.out.println("Sauce Labs Bike item is present");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifySauceLabsTShirtItemIsPresent() {

		try{
			driver.findElement(SauceLabsTShirt).isDisplayed();

			System.out.println("Sauce Labs TShirt item is present");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifySauceLabsFleeceJacketItemIsPresent() {

		try{
			driver.findElement(SauceLabsFleeceJacket).isDisplayed();

			System.out.println("Sauce Labs Fleece Jacket item is present");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifySauceLabsOnesieItemIsPresent() {

		try{
			driver.findElement(SauceLabsOnesie).isDisplayed();

			System.out.println("Sauce Labs Onesie item is present");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifySauceLabsTshirtRedItemIsPresent() {

		try{
			driver.findElement(SauceLabsTshirtRed).isDisplayed();

			System.out.println("Sauce T-Shirt Red Item is present");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifySauceBackPackItemIsPresent() {

		try{
			driver.findElement(SauceBackPack).isDisplayed();

			System.out.println("Sauce Back Pack Item is present");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCheckOutButton() {

		try{
			driver.findElement(CheckOut).click();

			System.out.println("Check Out Button was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifyPageIsCheckOutPage() {

		try{
			driver.findElement(CheckOutPage).isDisplayed();

			System.out.println("Checkout: Your Information is displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFirstName() {

		try{
			driver.findElement(firstName).click();

			System.out.println("FirstName was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearFirstName() {

		try{
			driver.findElement(firstName).clear();

			System.out.println("FirstName was cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterFirstName(String text) {

		try{
			driver.findElement(firstName).sendKeys(text);

			System.out.println("FirstName was cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLastName() {

		try{
			driver.findElement(lastName).click();

			System.out.println("LastName was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearLastName() {

		try{
			driver.findElement(lastName).clear();

			System.out.println("LastName was cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterLastName(String text) {

		try{
			driver.findElement(lastName).sendKeys(text);

			System.out.println("LastName was cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickZipCode() {

		try{
			driver.findElement(zipCode).click();

			System.out.println("Zip Code was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearZipCode() {

		try{
			driver.findElement(zipCode).clear();

			System.out.println("Zip Code was cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterZipCode(String text) {

		try{
			driver.findElement(zipCode).sendKeys(text);

			System.out.println("Zip Code was cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickContinueButton() {

		try{
			driver.findElement(continueButton).click();

			System.out.println("Continue Button was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifyPageIsCheckOutOverview() {

		try{
			driver.findElement(checkoutOverview).isDisplayed();

			System.out.println("Checkout: Overview is displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFinishButton() {

		try{
			driver.findElement(finishButton).click();

			System.out.println("Finish button was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void VerifyPurchaseWasSuccessful() {

		try{
			driver.findElement(purchaseSuccess).isDisplayed();

			System.out.println("THANK YOU FOR YOUR ORDER is displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFilterButton() {

		try{
			driver.findElement(SortFilterButton).click();
			System.out.println("Sort Filter button clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}

	}

	public void ClickHighToLowOption() {

		try{
			Select sorting = new Select(driver.findElement(SortingOption));
			sorting.selectByVisibleText("Price (high to low)");
			//sorting.selectByIndex(4);
			System.out.println("High to Low option selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}

	}

	public void ClickSelectContainer() {

		try{
			driver.findElement(SortFilterButton).click();
			System.out.println("Select Option button clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}

	}

	public void ClickZtoA() {

		try{
			Select sorting = new Select(driver.findElement(SortingOption));
			sorting.selectByVisibleText("Name (Z to A)");
			//sorting.selectByIndex(1);
			System.out.println("Name (Z to A) selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}

	}


}







