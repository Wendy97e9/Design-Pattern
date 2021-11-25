package visitorBuyCart;

public class Customer extends Visitor {

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("顾客"+this.name+"挑选苹果。");

	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("顾客"+this.name+"挑选书本。");

	}

}
