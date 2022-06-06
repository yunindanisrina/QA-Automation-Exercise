package tugasAutomation.Tugas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class Overview extends WebBase {

	public Overview(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	  private By finishButton = By.xpath("//button[@id='finish']");
	  private By cancelButton = By.xpath(" //button[@id='cancel']");

	  @Step("Click \"FINISH\" button on the Overview page")
	  public void clickFinishButton() {
	    driver.get().findElement(finishButton).click();
	  }

	  public void clickCancelButton() {
	    driver.get().findElement(cancelButton).click();
	  }
}
