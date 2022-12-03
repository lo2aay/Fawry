package swPrj;

public class wallet extends paymentMethods{
	User user;
	private form fo;
	public double amount;
	public wallet(double amou) {
		amount = amou;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setForm(form Form) {
		Form = fo;
	}
	public void get() {
		amount-=fo.getMoney();
	}
	public void put() {
		
	}
}
	