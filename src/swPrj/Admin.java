package swPrj;

import java.util.ArrayList;

public class Admin {
	static ArrayList<Refund> r;
	static ArrayList<OverallDiscount> od;
	static ArrayList<SpecificDiscount> sd;

	public void addOverall(double o) {
		Discount d = new NullDiscount(0);
		OverallDiscount OverDisc = new OverallDiscount(d);
		OverDisc.setDiscount(o);
		od.add(OverDisc);
	}

	public void addSpecific(double d, String n) {
		Discount de = new NullDiscount(0);
		SpecificDiscount SpecificDec1 = new SpecificDiscount(de);
		SpecificDec1.setDiscount(d);
		SpecificDec1.setName(n);
		sd.add(SpecificDec1);

	}

	public Admin() {
		r = new ArrayList<Refund>();
		od = new ArrayList<OverallDiscount>();
		sd = new ArrayList<SpecificDiscount>();
	}

	public void newReq(Refund req) {
		r.add(req);
	}

	public boolean acceptRequest(String username) {
		for (User itr : Account.userData) {
			if (itr.Name.equals(username)) {
				itr.wal += itr.lastPaidMoney;
				return true;
			}
		}
		return false;
	}

}
