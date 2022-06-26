package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tutorials {
	WebDriver driver;

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
	}
	@Test
	public void b_PersonalInfo() {
		driver.findElement(By.id("input-firstname")).sendKeys("viswa");
		driver.findElement(By.id("input-lastname")).sendKeys("nathan");
		driver.findElement(By.id("input-email")).sendKeys("vis@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8015280504");
		driver.findElement(By.id("input-password")).sendKeys("Viswa@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Viswa@123");
	}
	@Test
	public void c_Subscribe() {
		WebElement radiobutton = driver.findElement(By.name("newsletter"));
		radiobutton.click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@name='agree']/following::input")).click();
	}
}
