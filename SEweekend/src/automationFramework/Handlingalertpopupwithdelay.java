package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalertpopupwithdelay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("timerAlertButton")).click();
	    Thread.sleep(10000);
	    Alert Abc = driver.switchTo().alert();
		String Popup = Abc.getText();
		System.out.println(Popup);
		Abc.accept();

	}
}
