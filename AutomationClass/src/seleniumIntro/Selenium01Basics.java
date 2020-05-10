package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01Basics {

	public static void main(String[] args) {
		
		// I'm telling selenium which browser to open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\MayBatch\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("My title is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("My url is: " + url);
		// We have a different ways to find elements on our web site
		
		// Find element By Id attribute
		
		driver.findElement(By.id("email")).sendKeys("4690000000");
		
		// Find element by Name attribute
		driver.findElement(By.name("pass")).sendKeys("testautomation");
		
		// Find element by link text
		driver.findElement(By.linkText("Forgot account?")).click();
		
		// Find element by xpath
		// Two types of xpath 1. Absolute xpath 2. Relative xpath
		// Relative xpath
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("xpathselected");
		
		//Find Element by CSS
		driver.findElement(By.cssSelector("#identify_yourself_flow > div > div.uiInterstitialBar.uiBoxGray.topborder > div > div.rfloat._ohf > a > span")).click();
		
		

	}

}
