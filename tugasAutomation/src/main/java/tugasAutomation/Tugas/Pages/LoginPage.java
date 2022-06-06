package tugasAutomation.Tugas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.qameta.allure.Step;

public class LoginPage extends WebBase {
	  public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	  
	  private String errorNotificationUsername = "Epic sadface: Username is required";
	  private String errorNotificationPassword = "Epic sadface: Password is required";
	  private String strUsernameAndPassDoNotMatch = "Epic sadface: Username and password do not match any user in this service";

	  private By fieldUsername = By.xpath("//input[@id='user-name']");
	  private By fieldPassword = By.xpath("//input[@id='password']");
	  private By loginButton = By.xpath("//input[@id='login-button']");
	  private By errorNotificationUsernameAndPassword = By.xpath("//h3[@data-test='error']");
	  
 @Step("Fill \"Username\" field with data ({login}), fill \"Password\" field with data ({password}) and click \"LOGIN\" button")
	  public void login(String login, String password) {
		  driver.get().findElement(fieldUsername).sendKeys(login);
		  driver.get().findElement(fieldPassword).sendKeys(password);
		  driver.get().findElement(loginButton).click();
	  }
 	  
// 	  public Boolean testLoginFailedEmptyUsername() {
//		return driver.get().findElement(errorNotificationUsernameAndPassword).equals(errorNotificationUsername);
//	}
// 	  
//	  public boolean getErrorNotificationUsername() {
//			String actualText = driver.get().findElement(By.xpath("//h3[@data-test='error']")).getText();
//			String expectedText = getErrorNotificationUsername();
//			String result =
//			return driver.get().findElement(errorNotificationUsernam
//	  }
	  
	  
	  
	  
	  
//	  
//	  public String getErrorNotificationPassword() {
//		  return errorNotificationPassword;
//	  }
//	  
//	 public String getStrUsernameAndPassDoNotMatch() {
//		    return strUsernameAndPassDoNotMatch;
//		  }
	  
	  public Boolean loginButtonIsDisplayed() {
		    return driver.get().findElement(loginButton).isDisplayed();
	}
	  
}

