package initStrategy;


public class MovieTicket {
	
	private String Type;
	
	private double Price;
	
	public double Calculate()
	{
		//ѧ��Ʊ8��
		if (this.Type.equals("ѧ��Ʊ"))
		{
			return this.Price * 0.8;
		}
		//��ͯƱ���
		else if (this.Type.equals("��ͯƱ"))
		{
			return 0;
		}
		//VIPƱ5��
		else if (this.Type.equals("VIPƱ"))
		{
			return this.Price * 0.5;
		}
		//��ͨƱԭ��
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

