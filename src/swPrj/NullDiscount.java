package swPrj;

public class NullDiscount implements Discount {
	public double discount;

	public NullDiscount() {
		discount = 0.0;

	}

	public NullDiscount(double value) {
		this.discount += value;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}

	@Override
	public void setDiscount(double value) {
		this.discount += value;
	}

}
