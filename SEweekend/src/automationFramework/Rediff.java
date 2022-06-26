package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[text()='Full Name']/following::input[1]")).sendKeys("viswa");;
		driver.findElement(By.xpath("//td[contains(.,'Choose a Rediffmail ID')]/following::input[1]")).sendKeys("viswa123");;
		driver.findElement(By.xpath("//td[contains(.,'Retype password')]/preceding::input[1]")).sendKeys("Viswa@123");;

	}

}
