package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpromptpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("promtButton")).click();
	    Thread.sleep(5000);
	    Alert xyz = driver.switchTo().alert();
	    String popup = xyz.getText();
	    System.out.println(popup);
	    xyz.sendKeys("viswa");
	    xyz.accept();
	    //xyz.dismiss();
	    String Abc = driver.findElement(By.id("promptResult")).getText();
	    System.out.println(Abc);

	}

}
