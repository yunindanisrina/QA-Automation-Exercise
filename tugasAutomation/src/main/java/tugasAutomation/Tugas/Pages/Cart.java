package tugasAutomation.Tugas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import io.qameta.allure.Step;



public class Cart extends WebBase{

	public Cart(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	  private By checkoutButton = By.xpath("//button[@id='checkout']");
	  private By removeButton = By.xpath("//div[@class='cart_list']/div[@class='cart_item'][1]//button[text()='REMOVE']");
	  private By removeButtons = By.xpath("//button[@class='btn_secondary cart_button']");
	  private By listOfItems = By.xpath("//div[@class='cart_item']");
	  private By continueShoppingButton = By.xpath("//button[@id='continue-shopping']");

//	  public int listOfItems() {
//		   // List<WebElement> items = driver.get().findElement(listOfItems);
//		  List<WebElement> items = driver.get().findElement(listOfItems) ;
//		  return items.size();
//		  }

		  @Step("Click \"CHECKOUT\" button on the Cart page")
		  public void clickCheckoutButton() {
		    driver.get().findElement(checkoutButton).click();
		  }

		  @Step("Click \"CONTINUE SHOPPING\" button on the Cart page")
		  public void clickContinueShoppingButton() {
		    driver.get().findElement(continueShoppingButton).click();
		  }
}

