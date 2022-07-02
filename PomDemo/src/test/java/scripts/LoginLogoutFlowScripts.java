package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginLogoutFlowObjects;

public class LoginLogoutFlowScripts {
	WebDriver driver;
	
	
	@Test
	public void a_Pageload() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver2_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		LoginLogoutFlowObjects test = PageFactory.initElements(driver, LoginLogoutFlowObjects.class);
		test.login();
		test.logout();
	}
	

}
