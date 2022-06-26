package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement UploadFile = driver.findElement(By.id("uploadfile_0"));
		UploadFile.sendKeys("E:\\images\\IMG_20180908_195639.jpg");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();

	}

}
