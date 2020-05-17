package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\MayBatch\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://eaapp.somee.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/Account/Register']")).click();
		driver.findElement(By.cssSelector("input#UserName")).sendKeys("user name");

	}

}
