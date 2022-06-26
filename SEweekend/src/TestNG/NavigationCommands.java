package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
WebDriver driver;
	
	@Test
	public void a_pageLoad() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void b_navigate() throws InterruptedException {
		driver.navigate().to("http://zero.webappsecurity.com/index.html");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
