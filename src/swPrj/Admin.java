package swPrj;

import java.util.ArrayList;

public class Admin {
	ArrayList<Refund> r;
	
	public Admin() {
		r = new ArrayList<Refund>();
	}
	public void newReq(Refund req) {
		r.add(req);
	}
	public void requests() {
		for(int i=0;i<r.size();i++) {
			System.out.println(r.get(i).getPhone());
			System.out.println(r.get(i).getMoney());
			// y-accept aw y2olo shoflk klba
			
		}
	}

}
