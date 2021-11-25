package visitorBuyCart;

public class Apple implements Product {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);

	}

}
