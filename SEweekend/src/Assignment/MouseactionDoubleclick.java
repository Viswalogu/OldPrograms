package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionDoubleclick {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement Doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions act = new Actions(driver);
		act.doubleClick(Doubleclick).build().perform();
		Alert abc = driver.switchTo().alert();
		String popuptext = abc.getText();
		System.out.println(popuptext);
		Thread.sleep(2000);
		abc.accept();

	}

}
