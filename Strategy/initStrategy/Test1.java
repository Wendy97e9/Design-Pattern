package initStrategy;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		mt.setPrice(originalPrice);
		
		mt.setType("ѧ��Ʊ");
		currentPrice = mt.Calculate();
		System.out.println("ѧ��Ʊ "+currentPrice+" Ԫ");
		
		mt.setType("��ͯƱ");
		currentPrice = mt.Calculate();
		System.out.println("��ͯƱ "+currentPrice+" Ԫ");
		
		mt.setType("VIPƱ");
		currentPrice = mt.Calculate();
		System.out.println("VIPƱ "+currentPrice+" Ԫ");
		
	}

}
