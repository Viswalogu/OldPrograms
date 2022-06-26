package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@name='q']/following::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'POCO C31 (Royal Blue, 64 GB)')]")).click();
		String FirstTab = driver.getCurrentUrl();
		System.out.println(FirstTab);
		ArrayList <String> FlipkartTabs = new ArrayList<>(driver.getWindowHandles());
		for(String result:FlipkartTabs) {
			System.out.println(result);
		}
		driver.switchTo().window(FlipkartTabs.get(1));
		String SecondTab = driver.getCurrentUrl();
		System.out.println(SecondTab);
		
		

	}

}
