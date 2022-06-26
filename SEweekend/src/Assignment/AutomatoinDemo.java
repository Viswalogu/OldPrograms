package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatoinDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'click the button')]")).click();
		Alert first = driver.switchTo().alert();
		String abc = first.getText();
		System.out.println(abc);
		first.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
		Alert second = driver.switchTo().alert();
		String xyz = second.getText();
		System.out.println(xyz);
		second.accept();
		String confirm = driver.findElement(By.id("demo")).getText();
		System.out.println(confirm);
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
		Alert third = driver.switchTo().alert();
		String vis = third.getText();
		System.out.println(vis);
		third.sendKeys("viswanathan");
		third.accept();
		String prompt = driver.findElement(By.id("demo1")).getText();
		System.out.println(prompt);
		
		

	}

}
