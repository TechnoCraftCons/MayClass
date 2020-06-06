package seleniumIntro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium04Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement alertBtn = driver.findElement(By.id("alertbtn"));
		alertBtn.click();
		Alert alerts = driver.switchTo().alert();
		String alertText = alerts.getText();
		alerts.dismiss();
		
		WebElement nameTb = driver.findElement(By.id("name"));
		nameTb.sendKeys("Nebyou");
		WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
		confirmBtn.click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmationText = confirmAlert.getText();
		System.out.println(confirmationText);
		Assert.assertEquals(confirmationText, "Hello Nebyou, Are you sure you want to confirm?");
		confirmAlert.dismiss();
		WebElement tabBtn = driver.findElement(By.id("opentab"));
		tabBtn.click();
	}

}
