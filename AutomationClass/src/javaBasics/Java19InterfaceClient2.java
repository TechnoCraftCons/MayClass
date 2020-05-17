package javaBasics;

public class Java19InterfaceClient2 implements Java17InterfaceBank,Java20InterfaceBankOffers {

	public static void main(String[] args) {
		Java19InterfaceClient2 IC2 = new Java19InterfaceClient2();
		IC2.PayCreditCard();
		IC2.GenerateStatment();
		IC2.TransferBalance();
		IC2.CheckBalance();
		IC2.AnualFee();
		IC2.APRIntrest();
		IC2.CashBackOffer();

	}
	@Override
	public void PayCreditCard() {
		System.out.println("Your payment is due on the 15th each month");
		
	}
	@Override
	public void GenerateStatment() {
		// TODO Auto-generated method stub
		System.out.println("Your statement will generate the 3 days after payment due date");
	}

	@Override
	public void TransferBalance() {
		System.out.println("No fee for balance transfer");
		
	}

	@Override
	public void CheckBalance() {

		System.out.println("Checking you balance is free for 4 times a day");
		
	}
	@Override
	public void CashBackOffer() {
		System.out.println("You will have 5% cash back on every purchase");
		
	}

	@Override
	public void AnualFee() {
		System.out.println("No Anuall fee for one year");
		
	}

	@Override
	public void APRIntrest() {
		System.out.println("25% APR");
		
	}

}
