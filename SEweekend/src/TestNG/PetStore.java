package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PetStore {
	WebDriver driver;

	 @Test (priority=1)
	 public void pageLoad() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
	 }
	 @Test (priority=2)
	 public void UserInfo() {
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Viswa123");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Viswa123");
	 }
	 @Test (priority=3)
	 public void AccountInfo() {
		driver.findElement(By.name("account.firstName")).sendKeys("viswa");
		driver.findElement(By.name("account.lastName")).sendKeys("nathan");
		driver.findElement(By.name("account.email")).sendKeys("viswa@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("1234567998");
		driver.findElement(By.name("account.address1")).sendKeys("4/74 Gandhi street,chrompet,chennai");
		driver.findElement(By.name("account.address2")).sendKeys("4/74 Gandhi street,chrompet,chennai");
		driver.findElement(By.name("account.city")).sendKeys("Chennai");
		driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("600045");
		driver.findElement(By.name("account.country")).sendKeys("India");
	 }
	 @Test (priority=4)
	 public void ProfileInfo() {
		Select language = new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("japanese");
		Select Favourite = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		Favourite.selectByVisibleText("CATS");
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		driver.findElement(By.name("newAccount")).click();

	}

}
