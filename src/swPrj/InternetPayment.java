package swPrj;

public class InternetPayment extends Service{
	public WeInternet we;
	public VodafoneInternet voda;
	public OrangeInternet orange;
	public EtisalatInternet etisalat;

	public InternetPayment() {
		// TODO Auto-generated constructor stub
		we = new WeInternet();
		voda = new VodafoneInternet();
		orange = new OrangeInternet();
		etisalat = new EtisalatInternet();
	}

}
