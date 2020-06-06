package testngPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng01Class {
	@BeforeTest
	public void BeforeTest() {
		System.out.println("I ran before every test");
	}
	@Test
	public void CheckingAccountCreate() {
		System.out.println("I am trying to create a checking account");
	}

}
