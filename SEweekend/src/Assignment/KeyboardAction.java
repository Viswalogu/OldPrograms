package Assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("viswa@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("viswa@123");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"viswa@123").build().perform();
		//driver.findElement(By.name("login")).click();
		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}
