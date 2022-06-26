package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingiFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		driver.switchTo().frame("oddcouple");
		String content = driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();
		System.out.println(content);

	}

}
