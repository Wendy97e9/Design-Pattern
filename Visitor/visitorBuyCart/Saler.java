package visitorBuyCart;

public class Saler extends Visitor {

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("�ۻ�Ա"+this.name+"��ƻ�����أ�����۸�");

	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("�ۻ�Ա"+this.name+"ֱ�Ӽ����鱾�ļ۸�");
	}

}
