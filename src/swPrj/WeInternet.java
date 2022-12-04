package swPrj;

import java.util.Scanner;

public class WeInternet implements ServiceProvider {

	public PaymentMethods cash1;
	public PaymentMethods creditCard1;
	public PaymentMethods wallet1;
	public WeInternet() {
		cash1 = new Cash();
		creditCard1=new CreditCard();
		wallet1 = new Wallet();
	}


	@Override
	public double fee() {
		System.out.println("What amount you want to pay?");
		Scanner obj=new Scanner(System.in);
		double amount = obj.nextDouble();
		return amount;
	}

}
