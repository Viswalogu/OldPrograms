package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("Viswa");
		driver.findElement(By.id("last-name")).sendKeys("Nathan");
		driver.findElement(By.id("job-title")).sendKeys("Test engineer");
		//driver.findElement(By.id("radio-button-2")).click();
		WebElement collegeRadiobutton = driver.findElement(By.id("radio-button-2"));
		collegeRadiobutton.click();
		//driver.findElement(By.id("checkbox-1")).click();
		WebElement maleRadiobutton = driver.findElement(By.id("checkbox-1"));
		maleRadiobutton.click();
		Select experience = new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("2-4");
		driver.findElement(By.id("datepicker")).sendKeys("09/05/1996");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
	}

}
