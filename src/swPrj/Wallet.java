package swPrj;

public class Wallet implements PaymentMethods {

	public Wallet() {

	}

	@Override
	public boolean pay(User user, Double money) {

		if (user.wal >= money) {
			user.wal -= money;
			user.lastPaidMoney = money;

			return true;
		} else {
			return false;
		}
	}
}
