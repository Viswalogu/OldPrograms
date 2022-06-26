package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Sachin");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver.20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Wikipedia')]"))).click();
		
	}

}
