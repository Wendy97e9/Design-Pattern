package initStrategy;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		mt.setPrice(originalPrice);
		
		mt.setType("学生票");
		currentPrice = mt.Calculate();
		System.out.println("学生票 "+currentPrice+" 元");
		
		mt.setType("儿童票");
		currentPrice = mt.Calculate();
		System.out.println("儿童票 "+currentPrice+" 元");
		
		mt.setType("VIP票");
		currentPrice = mt.Calculate();
		System.out.println("VIP票 "+currentPrice+" 元");
		
	}

}
