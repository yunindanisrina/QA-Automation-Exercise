package tugasAutomation.Tugas;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import tugasAutomation.Tugas.Pages.Cart;
import tugasAutomation.Tugas.Pages.HomePage;
import tugasAutomation.Tugas.Pages.LoginPage;

public class CartTest extends WebDriverInit {
	
	  @Test
	  @Description(value = "Test confirms possibility to add product item to cart and then click CONTINUE SHOPPING button.")
	  public void addItemToCartAndContinueShopping() {
	    LoginPage loginPage = new LoginPage(driver, explicitWait);
	    HomePage homePage = new HomePage(driver, explicitWait);
	    Cart cart = new Cart(driver, explicitWait);
	    loginPage.login(UserData.userNameLogin,UserData.userPassword);
	    homePage.clickAddCartSauceLabsBackpackButton();
	    homePage.clickCartButton();
	    cart.clickContinueShoppingButton();
	    Assert.assertEquals("Sauce Labs Backpack", homePage.getitemSuiteInt());
	   //assertEquals(1, homePage.getitemSuiteInt());
	  }
}
