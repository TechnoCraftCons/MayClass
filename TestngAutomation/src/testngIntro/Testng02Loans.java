package testngIntro;

import org.testng.annotations.Test;

public class Testng02Loans {
	
	@Test(priority = 1, groups = {"smoke","regression"})
	public void LoginApp() {
		System.out.println("Logging into my Loan Application");
	}
	
	@Test(priority = 2 , groups = {"regression"})
	public void CreateLoan() {
		System.out.println("Creating a loan");
	}
	
	@Test(priority = 3)
	public void PreApproveLoan() {
		System.out.println("PreApproving a loan");
	}

}
