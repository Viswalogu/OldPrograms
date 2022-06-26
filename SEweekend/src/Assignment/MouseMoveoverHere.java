package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveoverHere {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://meesho.com/?utm_campaign=Web_Branded_Search_Campaign_Pan_India&utm_adgroup=Ad_Group&campaignid=15807870377&adgroupid=131428045869&keyword=meesho&device=c&gclid=CjwKCAjwrfCRBhAXEiwAnkmKmWZIDU6ims-L1ottPgcKMNq67VJnBouS_cvqE-I7Ps-lXMicH9uF1hoCbmsQAvD_BwE");
		Actions Act = new Actions(driver);
		WebElement Men = driver.findElement(By.xpath("//span[text()='Men']"));
		Act.moveToElement(Men).build().perform();

	}

}
