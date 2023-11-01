package actiTimePOMMeven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {

	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginButton;

	WebDriver driver;

	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName() {
		username.sendKeys("admin");
	}

	public void setPassword() {
		password.sendKeys("manager");
		}
	
	public void setLoginButton() {
		loginButton.click();
	}
}
