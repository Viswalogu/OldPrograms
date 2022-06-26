package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActoin1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("5");
		Thread.sleep(5000);
		for(int i=0;i<5;i++)
		{
			
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ARROW_UP).build().perform();
		}
		Thread.sleep(5000);
		
		 for (int j=0;j<5;j++)
		 {
			 Actions abc = new Actions(driver);
			 abc.sendKeys(Keys.ARROW_DOWN).build().perform();
		 }
			   
		
	}
}
