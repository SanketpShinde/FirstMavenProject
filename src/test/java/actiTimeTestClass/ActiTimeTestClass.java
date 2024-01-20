package actiTimeTestClass;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actiTimePOMMeven.ActiTimeHomePage;
import actiTimePOMMeven.ActiTimeLoginPage;

public class ActiTimeTestClass {
	WebDriver driver;
	ActiTimeHomePage home;
	ActiTimeLoginPage log;

	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser Opened");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Soft Test Tools\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log = new ActiTimeLoginPage(driver);
		home = new ActiTimeHomePage(driver);
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser Closed");
		driver.quit();

	}

	@BeforeMethod
	public void loginActiTime() {
		System.out.println("Login Into Application");

		log.setUserName();
		log.setPassword();
		log.setLoginButton();
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout the Application");
		//Reporter.log("after method running");
		home.logoutButton();
	}

	@Test
	public void toVerifytheLogo() {
		home.toVerifyLogo();
		System.out.println("Test scynario passed");
	}

//	@Test
//	public void task() 
//	{
//		System.out.println("clicked on task");
//		home.ClickOntask();
//	}
}
