package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorials {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("viswa");
		driver.findElement(By.id("input-lastname")).sendKeys("nathan");
		driver.findElement(By.id("input-email")).sendKeys("vis@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8015280504");
		driver.findElement(By.id("input-password")).sendKeys("Viswa@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Viswa@123");
		WebElement radiobutton = driver.findElement(By.name("newsletter"));
		radiobutton.click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@name='agree']/following::input")).click();
		String A = driver.findElement(By.xpath("//h1[contains(text(),'Has Been Created!')]")).getText();
		System.out.println(A);
		
		

	}
}
