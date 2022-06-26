package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextDemo {
WebDriver driver;
	
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.manage().window().maximize();
	}
	@Test
	public void b_demo() {
		driver.findElement(By.id("signin_button")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot your password ?')]")).click();
		//driver.findElement(By.linkText("Forgot your password ?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
