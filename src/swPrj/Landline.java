package swPrj;

public class Landline extends Service {

	public MonthlyReceipt mR;
	public QuarterReceipt qR;

	public Landline() {
		mR = new MonthlyReceipt();
		qR= new QuarterReceipt();
	}

}
