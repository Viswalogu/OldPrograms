package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionrightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement Rightclickbutton = driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
		Actions act = new Actions(driver);
		act.contextClick(Rightclickbutton).build().perform();
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Alert abc = driver.switchTo().alert();
		String popuptext = abc.getText();
		System.out.println(popuptext);
	}

}
