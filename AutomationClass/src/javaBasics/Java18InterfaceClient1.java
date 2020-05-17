package javaBasics;

public class Java18InterfaceClient1 implements Java17InterfaceBank, Java20InterfaceBankOffers {

	public static void main(String[] args) {
		Java18InterfaceClient1 IC1 = new Java18InterfaceClient1();
		IC1.PayCreditCard();
		IC1.GenerateStatment();
		IC1.TransferBalance();
		IC1.CheckBalance();
		IC1.AnualFee();
		IC1.APRIntrest();
		IC1.CashBackOffer();

	}

	@Override
	public void PayCreditCard() {
		System.out.println("Your payment is due on the 1st each month");
		
	}

	@Override
	public void GenerateStatment() {
		// TODO Auto-generated method stub
		System.out.println("Your statement will generate the week after payment due date");
	}

	@Override
	public void TransferBalance() {
		System.out.println("You will pay 10$ for balance transfer");
		
	}

	@Override
	public void CheckBalance() {

		System.out.println("Checking you balance is free");
		
	}

	@Override
	public void CashBackOffer() {
		System.out.println("You will have 3% cash back on every purchase");
		
	}

	@Override
	public void AnualFee() {
		System.out.println("No Anuall fee for two years");
		
	}

	@Override
	public void APRIntrest() {
		System.out.println("23% APR");
		
	}

}
