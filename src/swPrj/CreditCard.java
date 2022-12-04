package swPrj;

public class CreditCard implements PaymentMethods {

	public CreditCard() {
	}

	@Override
	public boolean pay(User user, Double money) {
		user.lastPaidMoney = money;
		// TODO Auto-generated method stub
		return true;
	}

}
