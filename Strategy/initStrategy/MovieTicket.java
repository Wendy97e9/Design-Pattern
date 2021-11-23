package initStrategy;


public class MovieTicket {
	
	private String Type;
	
	private double Price;
	
	public double Calculate()
	{
		//学生票8折
		if (this.Type.equals("学生票"))
		{
			return this.Price * 0.8;
		}
		//儿童票免费
		else if (this.Type.equals("儿童票"))
		{
			return 0;
		}
		//VIP票5折
		else if (this.Type.equals("VIP票"))
		{
			return this.Price * 0.5;
		}
		//普通票原价
		else
		{
			return this.Price;
		}
	}
	
	@Override
	public String toString() {
		return "MovieTicket [Type=" + Type + ", Price=" + Price + "]";
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}

