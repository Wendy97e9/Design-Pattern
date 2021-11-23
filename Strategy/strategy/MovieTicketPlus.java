package strategy;

//Context
public class MovieTicketPlus {
	
	private double Price;
	
	private IDiscount Discount;

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public IDiscount getDiscount() {
		return Discount;
	}

	public void setDiscount(IDiscount discount) {
		Discount = discount;
	}

}

