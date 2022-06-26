package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakingScreenshotMultiple {
	public WebDriver driver;

	@Test
	public void screenshot() throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("SubmitCreate")).click();
		getscreenshot();
	}

	private void getscreenshot() throws IOException {
		// TODO Auto-generated method stub

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Sujan\\Screenshots\\Screenshot" +System.currentTimeMillis()+ ".png"));

	}

}
