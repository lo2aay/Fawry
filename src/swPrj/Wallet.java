package swPrj;

public class Wallet implements PaymentMethods{
	User user;
	private Form fo;
	public double amount;
	public Wallet(double amou) {
		amount = amou;
		amount = 100000;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setForm(Form Form) {
		Form = fo;
	}
	public void get() {
		amount-=fo.getMoney();
	}
	public void put() {
		
	}
	@Override
	public boolean pay(User user, Double money) {
		if(user.wal.amount>=money) {
			user.wal.amount -= money;
			return true;
		}else {
		return false;}
	}
}
	