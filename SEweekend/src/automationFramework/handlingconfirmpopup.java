package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingconfirmpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("confirmButton")).click();
	    Alert Abc = driver.switchTo().alert();
	    String Popup = Abc.getText();
	    System.out.println(Popup);
	    Thread.sleep(5000);
	    //Abc.accept();
	    Abc.dismiss();
	    String Rst = driver.findElement(By.id("confirmResult")).getText();
	    System.out.println(Rst);
	    
	    

	}

}
