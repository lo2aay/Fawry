package swPrj;

public class DiscountDecorator implements Discount {
	public Discount amount;

	public DiscountDecorator() {

	}

	public DiscountDecorator(Discount value) {
		this.amount = value;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return amount.getDiscount();
	}

	@Override
	public void setDiscount(double value) {
		amount.setDiscount(value);
	}

}
