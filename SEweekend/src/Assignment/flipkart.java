package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		Actions act = new Actions(driver);
		WebElement ElectronicsLink = driver.findElement(By.xpath("/div[text()='Electronics']"));
		act.moveToElement(ElectronicsLink).build().perform();

	}

}
