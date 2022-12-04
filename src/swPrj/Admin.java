package swPrj;

import java.util.ArrayList;

public class Admin {
	static ArrayList<Refund> r;
	
	public Admin() {
		r = new ArrayList<Refund>();
	}
	public void newReq(Refund req) {
		r.add(req);
	}
	public boolean acceptRequest(String username) {
		for (User itr : Account.userData) {
			if(itr.Name.equals(username)) {
				itr.wal += itr.lastPaidMoney;
				return true;
			}
		}
		return false;
	}
	

}
