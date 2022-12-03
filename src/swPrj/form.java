package swPrj;

public class form {
	User user;
	public String phoneNum;
	public double money;
	public form(String p, double m) {
		phoneNum=p;
		money = m;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	

}
