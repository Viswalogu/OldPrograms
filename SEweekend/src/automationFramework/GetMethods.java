package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		driver.findElement(By.id("signin_button")).click();
		String LoginUrl = driver.getCurrentUrl();
		System.out.println(LoginUrl);
		//System.out.println((driver.findElement(By.xpath("//h3[contains(text(),'Log')]")).getText()));
		String LoginTitle = driver.findElement(By.xpath("//h3[contains(text(),'Log')]")).getText();
		System.out.println(LoginTitle);
		String Forgot = driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]")).getText();
		System.out.println(Forgot);
		String SignInbuttonStarttag = driver.findElement(By.name("submit")).getTagName();
		System.out.println(SignInbuttonStarttag);
		String Attribute = driver.findElement(By.name("submit")).getAttribute("class");
		System.out.println(Attribute);
		String CssValue = driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(CssValue);
	}

}
