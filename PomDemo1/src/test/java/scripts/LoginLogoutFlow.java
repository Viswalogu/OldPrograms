package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import automationFramework.Objects;

public class LoginLogoutFlow {

	WebDriver driver;
	
	@Test
	public void a_PageLoad() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver2_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Objects obs = PageFactory.initElements(driver, Objects.class);
		obs.Login();
		obs.Logout();
	}
	
}
