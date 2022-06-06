package tugasAutomation.Tugas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class Checkout extends WebBase {

	public Checkout(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	  private String errorFirstNameNotification = "Error: First Name is required";
	  private String errorLastNameNotification = "Error: Last Name is required";
	  private String errorPostalCodeNotification = "Error: Postal Code is required";
	  
	  private By firstNameField = By.xpath("//input[@id='first-name']");
	  private By lastNameField = By.xpath("//input[@id='last-name']");
	  private By postalCodeField = By.xpath("//input[@id='postal-code']");
	  private By checkoutButton = By.id("continue");
	  private By errorNotification = By.xpath("//h3[@data-test='error']");
	  
	  @Step("Fill field \"First Name\" with data ({firstname}), fill field \"Last Name\" with data ({lastName}), fill field \"Zip/Postal Code\" with data ({postalCode})")
	  public void fillFields(String firstname, String lastName, String postalCode) {
	    driver.get().findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstname);
	    driver.get().findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
	    driver.get().findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalCode);
	  }

	  @Step("Click \"CONTINUE\" button on the Checkout page")
	  public void clickCheckoutButton() {
	    driver.get().findElement(checkoutButton).click();
	  }
	
	  @Step("Method returns notification with requirement of necessary about First Name")
	  public String getErrorFirstNameNotification() {
	    return errorFirstNameNotification;
	  }

	  @Step("Method returns notification with requirement of necessary about Last Name")
	  public String getErrorLastNameNotification() {
	    return errorLastNameNotification;
	  }

	  @Step("Method returns notification with requirement of necessary about Postal Code")
	  public String getErrorPostalCodeNotification() {
	    return errorPostalCodeNotification;
	  }

	  @Step("Method returns error notification")
	  public String errorNotification() {
	    return driver.get().findElement(errorNotification).getText();
	  }
}
