package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSselector {
WebDriver driver;
	
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_CSScelector() {
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

}
