package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;

public class HomePageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void StartUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriverv83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://eaapp.somee.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CleanUp() {
		driver.close();
	}
	
	@Test
	public void ClickLinks() {
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.AboutLink().click();
		hpo.EmployeesListLink().click();
		hpo.RegistrationLink().click();
		hpo.LoginLink().click();
		hpo.HomeLink().click();	
	}
	
	@Test
	public void HomePageTesting() {
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.HomeLink().click();
		hpo.RegistrationLink().click();
		
	}

}
