package swPrj;

public class Refund {
	public String phone;
	public double money;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Refund(String p, double m) {
		phone =p;
		money = m;
	}

}
