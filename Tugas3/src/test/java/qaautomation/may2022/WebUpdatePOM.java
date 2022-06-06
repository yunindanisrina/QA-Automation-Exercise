package qaautomation.may2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.may2022.pages.LoginPage;
import qaautomation.may2022.pages.ProfilePage;

public class WebUpdatePOM extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	
	@Test
	public void testLogin() {
		// cara mendapatkan username dengan xpath
		loginPage.loginWeb("tomsmith", "SuperSecretPassword!");
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void testLoginFailedWrongPassword() {
		// cara mendapatkan username dengan xpath
		loginPage.loginWeb("tomsmith", "SuperSecretzzzzz");
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "invalid";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void testLoginFailedWrongUsername() {
		// cara mendapatkan username dengan xpath
		loginPage.loginWeb("tomsmithzzz", "SuperSecretPassword!");
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "invalid";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void testLoginFailedWrongUsernameandPassword() {
		// cara mendapatkan username dengan xpath
		loginPage.loginWeb("tomsmithzzz", "SuperSeczretzzzzz");
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "invalid";
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
