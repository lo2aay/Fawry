package swPrj;

public class handler {
	form fo;
	wallet wal;
	public handler() {
		// TODO Auto-generated constructor stub
	}

	public void setFo(form fo) {
		this.fo = fo;
	}
	public void handle() {
		if(fo.getPhoneNum().length()!=11) {
			System.out.println("NOT VALID");
		}
		if(fo.getMoney()>wal.getAmount()) {
			System.out.println("No enough money");
		}
	}

}
