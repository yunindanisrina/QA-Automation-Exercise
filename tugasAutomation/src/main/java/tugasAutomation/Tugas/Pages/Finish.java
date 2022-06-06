package tugasAutomation.Tugas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class Finish extends WebBase {

	public Finish(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	 private By gratitudeNotification = By.xpath("//div[@class='complete-text']");

	  @Step("Return notification with gratitude")
	  public String getGratitudeNotification() {
	    return driver.get().findElement(gratitudeNotification).getText();
	  }

	
}
