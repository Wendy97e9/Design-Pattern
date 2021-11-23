package strategy;


public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicketPlus mt = new MovieTicketPlus();
		double originalPrice = 60.0;
		double currentPrice;
		
		mt.setDiscount(new StudentDiscount());
		currentPrice = mt.getDiscount().Calculate(originalPrice);
		System.out.println("ѧ��Ʊ "+currentPrice+" Ԫ");
		
		mt.setDiscount(new ChildrenDiscount());
		currentPrice = mt.getDiscount().Calculate(originalPrice);
		System.out.println("��ͯƱ "+currentPrice+" Ԫ");
		
		mt.setDiscount(new VIPDiscount());
		currentPrice = mt.getDiscount().Calculate(originalPrice);
		System.out.println("VIPƱ "+currentPrice+" Ԫ");
	}
	
}
