package seleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium03ElementsSpiceJet {

	public static void main(String[] args)   {
		// TODO from and to destinations assertion and build customized path for the departure date
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// Different drop downs 1. Static drop down 2. Dynamic drop down
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Click the drop down 
		WebElement from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		from.click();
		// Click the departure city
		WebElement fromCity = driver.findElement(By.xpath("//div[@id='wrapper']//ul[1]//li[9]//a[1]"));
		fromCity.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		
		WebElement to = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		WebElement toCity = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//ul[3]//li[9]//a[1]"));
		toCity.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Assert.assertEquals(cityValue, "Chennai (MAA)");
		String toCityValue = to.getText();
		//Assert.assertEquals(toCityValue, "Mumbai (BOM)");
		System.out.println(toCityValue);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement departureDate = driver.findElement(By.xpath("//div[1]//table[1]//tbody[1]//tr[4]//td[7]//a[1]"));
		departureDate.click();
		
		WebElement travlersNumber = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		travlersNumber.click();
		
		WebElement ddlAdult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		WebElement ddlChild = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		WebElement ddlInfant = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		
		Select sAdult = new Select(ddlAdult);
		Select sChild = new Select(ddlChild);
		Select sInfant = new Select(ddlInfant);
		
		sAdult.selectByIndex(4);
		sChild.selectByValue("2");
		sInfant.selectByVisibleText("2");
		
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(currency);
		s.selectByIndex(2);
		
		WebElement ffCheckBox = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		ffCheckBox.click();
		
		boolean fmlyCheckBoxValue = ffCheckBox.isSelected();
		//System.out.println(fmlyCheckBoxValue);
		Assert.assertEquals(fmlyCheckBoxValue, true);
		
		String number = travlersNumber.getText();
		//System.out.println(number);
		Assert.assertEquals(number, "5 Adult, 2 Child, 2 Infant");
	}

}
