package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver2_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();

	}

}
