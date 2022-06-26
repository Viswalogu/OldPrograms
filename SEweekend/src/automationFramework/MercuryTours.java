package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Viswanathan");
		driver.findElement(By.name("lastName")).sendKeys("Loganathan");
		driver.findElement(By.name("phone")).sendKeys("8015280504");
		driver.findElement(By.id("userName")).sendKeys("viswabhai.l123@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("no.8,gangai amman koil st");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("600045");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("viswabhai.l123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Nathan@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Nathan@123");
		driver.findElement(By.name("submit")).click();
		
	}

}
