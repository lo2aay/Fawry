package swPrj;

public class SpecificDiscount extends DiscountDecorator {
	public String s;

	public SpecificDiscount() {
		// TODO Auto-generated constructor stub
	}

	public SpecificDiscount(Discount d) {
		super(d);
	}

	public void setDiscount(double value) {
		amount.setDiscount(value);
	}

	public double getDiscount() {
		return amount.getDiscount();
	}

	public void setName(String sa) {
		s = sa;
	}

}
