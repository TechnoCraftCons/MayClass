package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;

public class HomePageTest {
WebDriver driver;
	
	@BeforeMethod
	public void StartUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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
