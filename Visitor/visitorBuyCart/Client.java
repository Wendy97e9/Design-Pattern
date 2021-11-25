package visitorBuyCart;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product a1 = new Apple();
		Product a2 = new Apple();
		Product b1 = new Book();
		Product b2 = new Book();
		BuyBasket basket = new BuyBasket();
		basket.addProduct(a1);
		basket.addProduct(b1);
		basket.addProduct(a2);
		basket.addProduct(b2);
		Visitor visitor = new Customer();
		visitor.setName("买东西的");
		basket.accept(visitor);
		
		visitor = new Saler();
		visitor.setName("卖东西的");
		basket.accept(visitor);

		
	}

}
