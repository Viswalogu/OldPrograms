package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("viswa");
		driver.findElement(By.id("last-name")).sendKeys("nathan");
		driver.findElement(By.id("postal-code")).sendKeys("600045");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String A = driver.getCurrentUrl();
		System.out.println(A);
		String d = driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU ')]")).getText();
		System.out.println(d);
		String e = driver.findElement(By.xpath("//div[starts-with(text(),'Your order has')]")).getText();
		System.out.println(e);
		String f = driver.findElement(By.xpath("//div[starts-with(text(),'Your order')]/following::img[1]")).getTagName();
		System.out.println(f);
		String B = driver.findElement(By.xpath("//div[starts-with(text(),'Your order')]/following::img[1]")).getAttribute("alt");
		System.out.println(B);
		String g = driver.findElement(By.name("back-to-products")).getCssValue("width");
		System.out.println(g);
		
		
		

	}

}
