package swPrj;

public class OverallDiscount extends DiscountDecorator {

	public OverallDiscount() {
	}

	public OverallDiscount(Discount d) {
		super(d);
	}

	public void setDiscount(double value) {
		amount.setDiscount(value);
	}

	public double getDiscount() {
		return amount.getDiscount();
	}

}
