package actiTimePOMMeven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {

	@FindBy(xpath = "//img[@height='61']")
	private WebElement logo;

	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='content tasks_selected selected']")
	private WebElement task;

	public ActiTimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void toVerifyLogo() {
		boolean l = logo.isDisplayed();
		if (l == true) {
			System.out.println("test case passed " + l);
		} else {
			System.out.println("test case failed " + l);
		}

	}

	public void logoutButton() {
		logout.click();
	}
	public void ClickOntask() 
	{
		task.click();
	}
}
