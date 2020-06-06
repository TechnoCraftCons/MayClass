package testngIntro;

import org.testng.annotations.Test;

public class Testng03PersonalLoan {
	
	@Test(groups= {"smoke","regression"})
	public void LoginPersonalLoanApp() {
		System.out.println("Logging into my Loan Application");
	}
	
	@Test(groups= {"regresssion"})
	public void CreatePersonalLoan() {
		System.out.println("Creating a loan");
	}
	
	@Test
	public void PreApprovePersonalLoan() {
		System.out.println("PreApproving a loan");
	}


}
