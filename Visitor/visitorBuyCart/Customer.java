package visitorBuyCart;

public class Customer extends Visitor {

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("�˿�"+this.name+"��ѡƻ����");

	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("�˿�"+this.name+"��ѡ�鱾��");

	}

}
