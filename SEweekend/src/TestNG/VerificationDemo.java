package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationDemo {
	WebDriver driver;

	@Test
	public void a_pageLoad(){
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
	}
	@Test
	public void b_RadioButton() {
		WebElement college = driver.findElement(By.id("radio-button-2"));
		college.click();
		System.out.println(college.isEnabled());
	}
	@Test
	public void c_checkbox() {
		WebElement male = driver.findElement(By.id("checkbox-1"));
		male.click();
		System.out.println(male.isSelected());
		
	}

}
