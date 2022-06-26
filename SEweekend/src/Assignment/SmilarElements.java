package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		driver.manage().window().maximize();
		int Links = driver.findElements(By.tagName("a")).size();
		System.out.println(Links);
		int imgcount = driver.findElements(By.tagName("img")).size();
		System.out.println(imgcount);

	}

}
