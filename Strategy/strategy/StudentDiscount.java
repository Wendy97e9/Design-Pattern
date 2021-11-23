package strategy;

// ConcreteStrategy
public class StudentDiscount implements IDiscount {

	@Override
	public double Calculate(double price) {
		// TODO Auto-generated method stub
		return price * 0.8;
	}

}
