package swPrj;

public class Cash implements PaymentMethods {

	public Cash() {
	}

	@Override
	public boolean pay(User user, Double money) {
		user.lastPaidMoney = money;
		// TODO Auto-generated method stub
		return true;
	}

}
