package swPrj;

public class Donations extends Service {
	public CancerHospital cH;
	public Schools s;
	public NGOs ngo;
	public Donations() {
		// TODO Auto-generated constructor stub
		cH = new CancerHospital();
		s = new Schools();
		ngo = new NGOs();
		
	}

}
