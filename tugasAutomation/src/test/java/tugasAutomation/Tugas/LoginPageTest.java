package tugasAutomation.Tugas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import tugasAutomation.Tugas.Pages.HomePage;
import tugasAutomation.Tugas.Pages.LoginPage;

public class LoginPageTest extends WebDriverInit {
	

	@Test
	@Description(value = "Login with correct Username and Password")
	public void CorrectLogin() {
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		HomePage homePage = new HomePage(driver, explicitWait);
		loginPage.login(UserData.userNameLogin, UserData.userPassword);
	    Assert.assertTrue(homePage.getVisibleCartButton().isDisplayed());
	}
	
//	@Test
//	@Description(value = "Login with empty Username field and see notification about requirement of Username data")
//	public void LoginWithEmptyUsername() {
//		LoginPage loginPage = new LoginPage(driver, explicitWait);
//		loginPage.login(" ", "secret_sauce");
//		Assert.assertTrue(loginPage.getErrorNotificationUsername());
//	}

	
	
	
	

}
