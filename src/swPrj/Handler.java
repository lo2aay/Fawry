package swPrj;

public class Handler {
	Form fo;
	Wallet wal;
	public Handler(Form f) {
		// TODO Auto-generated constructor stub
		fo=f;
	}


	public boolean handle() {
		if(fo.getPhoneNum().length()!=11) {
			System.out.println("Phone number is not valid");
			return false;
		}
		return true;

	}

	public Wallet getWal() {
		return wal;
	}

	public void setWal(Wallet wal) {
		this.wal = wal;
	}

}
