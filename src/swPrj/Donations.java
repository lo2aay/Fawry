package swPrj;

public class Donations extends Service {
	public CancerHospital cH;
	public Schools s;
	public NGOs ngo;
	public Donations() {
		cH = new CancerHospital();
		s = new Schools();
		ngo = new NGOs();
		
	}
	@Override
	public void serviceName() {
		System.out.println("Donations");
		
	}
	

}
