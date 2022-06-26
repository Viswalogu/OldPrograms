package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nakuri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Register']")).click();
		ArrayList <String> Register = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(Register.get(1));
		driver.findElement(By.id("name")).sendKeys("Viswa");
		driver.findElement(By.id("email")).sendKeys("Viswa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Viswa123");
		driver.findElement(By.id("mobile")).sendKeys("8015255556");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}