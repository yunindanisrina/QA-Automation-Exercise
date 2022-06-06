package tugasAutomation.Tugas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		explicitWait.set(new WebDriverWait(driver.get(),Duration.ofSeconds(5)));
		driver.get().get("https://google.com");
		driver.get().get("https://yopmail.com/en/");

	}
	
	
	  private By fieldLogin = By.xpath("//input[@id='login']");
	  private By loginButton = By.xpath("//*[@id=\"refreshbut\"]/button");
	
	@Test
	public void login() {
		  driver.get().findElement(fieldLogin).sendKeys("houmaguffeufa-4602@yopmail.com");
		  driver.get().findElement(loginButton).click();
	  }
	  
	  public Boolean loginButtonIsDisplayed() {
		    return driver.get().findElement(loginButton).isDisplayed();
	}
	  
	public String handleIframe() {
		driver.get().findElement(By.id("e_ZwVjAGZjZQVjZmNlZQNjZQL0ZwRmZD")).click();
		WebElement element = driver.get().findElement(By.id("ifmail"));
		driver.get().switchTo().frame(element);
		driver.get().findElement(By.id("mail")).sendKeys("Testing");
		
		return driver.get().switchTo().defaultContent().getTitle();

	}
	


	@AfterMethod
	public void tearDown() {

		driver.get().quit();

	}
	
	



}
