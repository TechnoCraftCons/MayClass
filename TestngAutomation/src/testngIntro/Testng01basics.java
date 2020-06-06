package testngIntro;

import org.testng.annotations.*;


public class Testng01basics {
	// We have different types of annotations
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I ran before everyone on the Suite level");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("I ran last after everyone got executed");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("* I ran before  test *");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("** I ran after test **");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("*** I ran before the class ***");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("*** I ran after the class ***");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("**** I ran before the method ****");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("**** I ran after the method ****");
	}
	
	@Test(groups = {"smoke","regression"})
	public void Login( ) {
		System.out.println("This is my login test url is: ");
	}
	@Parameters({"url","userName"})
	@Test(groups= {"regression"})
	public void Login2(String MyURl, String UserName) {
		System.out.println("This is the url from testng xml file: " +MyURl);
		System.out.println("This is my user name from the xml file: " + UserName);
	}
	
	@Test(dependsOnMethods="CreateUser")
	public void Register() {
		System.out.println("This is my registration test");
	}
	
	@Test(dependsOnMethods="Login",groups= {"regression"}, enabled = true)
	public void CreateUser() {
		System.out.println("This is my create user test");
	}

}
