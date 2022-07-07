package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Objects {
	WebDriver driver;
	
	public Objects()
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using="user-name") WebElement Username;
	@FindBy(how = How.ID, using = "password") WebElement Password;
	@FindBy(how = How.ID, using = "login-button") WebElement Loginbutton;
	@FindBy(how = How.ID, using = "react-burger-menu-btn") WebElement Menu;
	@FindBy(how = How.ID, using = "logout_sidebar_link") WebElement Logout;

	public void Login()
	{
		Username.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Loginbutton.click();
	}
	public void Logout() throws InterruptedException
	{
		Thread.sleep(5000);
		Menu.click();
		Thread.sleep(5000);
		Logout.click();
	}
}
