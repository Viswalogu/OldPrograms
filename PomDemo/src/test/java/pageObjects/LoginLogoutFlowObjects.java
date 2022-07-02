package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginLogoutFlowObjects {
	WebDriver driver;

	public LoginLogoutFlowObjects() {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "user-name") WebElement Username;
	@FindBy(how = How.ID, using = "password") WebElement Password;
	@FindBy(how = How.ID, using = "login-button") WebElement Loginbutton;
	@FindBy(how = How.ID, using = "react-burger-menu-btn") WebElement Menu;
	@FindBy(how = How.ID, using = "logout_sidebar_link") WebElement Logout;

	public void login() {
		Username.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Loginbutton.click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		Menu.click();
		Thread.sleep(5000);
		Logout.click();
	}
}

