package tugasAutomation.Tugas.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;


import io.qameta.allure.Step;

public class HomePage extends WebBase {

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	private By homePageTitle = By.xpath("//div[@class='app_logo']");
	private By sauceLabsBacpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	private By addCartSauceLabsBackpackToCartButton = By.xpath ("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	private By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]");
	private By itemsSuite = By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_name']");
	

	  public String getitemSuiteInt() {
		 String sizeInString = driver.get().findElement(itemsSuite).getText();
		 return sizeInString;
	  }
	 
	  public WebElement getVisibleCartButton() {
		    WebElement visibleCartButton = driver.get().findElement(cartButton);
		    return visibleCartButton;
		  }
	  @Step("Click on the name of the Sauce Labs Backpack product item")
	  public void clickSauceLabsBackpack() {
	    driver.get().findElement(sauceLabsBacpack).click();
	  }

	  @Step("Click \"ADD TO CART\" button on the Sauce Labs Backpack product item on the Home page")
	  public void clickAddCartSauceLabsBackpackButton() {
	    driver.get().findElement(addCartSauceLabsBackpackToCartButton).click();
	  }

	  @Step("Click \"Cart\" icon on the Home page")
	  public void clickCartButton() {
	    driver.get().findElement(cartButton).click();
	  }
}
