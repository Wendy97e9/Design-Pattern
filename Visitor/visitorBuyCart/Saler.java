package visitorBuyCart;

public class Saler extends Visitor {

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("售货员"+this.name+"给苹果称重，计算价格。");

	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("售货员"+this.name+"直接计算书本的价格。");
	}

}
