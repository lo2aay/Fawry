package swPrj;

public class MobileRecharge extends Service {

	public WeMobile we;
	public VodafoneMobile voda;
	public OrangeMobile orange;
	public EtisalatMobile etisalat;

	public MobileRecharge() {
		we = new WeMobile();
		voda = new VodafoneMobile();
		orange = new OrangeMobile();
		etisalat = new EtisalatMobile();
	}

	@Override
	public void serviceName() {
		System.out.println("MobileRecharge");
		
	}

}
