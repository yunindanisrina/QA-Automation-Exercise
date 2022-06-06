package tugasAutomation.Tugas;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import tugasAutomation.Tugas.Pages.Cart;
import tugasAutomation.Tugas.Pages.Checkout;
import tugasAutomation.Tugas.Pages.Finish;
import tugasAutomation.Tugas.Pages.HomePage;
import tugasAutomation.Tugas.Pages.LoginPage;
import tugasAutomation.Tugas.Pages.Overview;

public class BuyProductTest extends WebDriverInit {
	

    @Test
    @Description(value = "E2E test, that checks possibility to login with correct data and make successful purchase.")
    public void buyProduct() {
    LoginPage loginPage = new LoginPage(driver, explicitWait);
    HomePage homePage = new HomePage(driver, explicitWait);
    Cart cart = new Cart(driver, explicitWait);
    Checkout checkout = new Checkout(driver, explicitWait);
    Overview overview = new Overview(driver, explicitWait);
    Finish finish = new Finish(driver, explicitWait);
    loginPage.login(UserData.userNameLogin, UserData.userPassword);
    homePage.clickAddCartSauceLabsBackpackButton();
    homePage.clickCartButton();
    cart.clickCheckoutButton();
    checkout.fillFields(UserData.firstName, UserData.lastName, UserData.postalCode);
    checkout.clickCheckoutButton();
    overview.clickFinishButton();
    Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", finish.getGratitudeNotification());
  }
	

}
