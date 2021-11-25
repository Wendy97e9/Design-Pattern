package visitorBuyCart;

public interface Product {
	
	public abstract void accept(Visitor visitor);

}
