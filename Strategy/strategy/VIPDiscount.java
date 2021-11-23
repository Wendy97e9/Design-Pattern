package strategy;

// ConcreteStrategy
public class VIPDiscount implements IDiscount {

	@Override
	public double Calculate(double price) {
		// TODO Auto-generated method stub
		return price * 0.5;
	}

}
