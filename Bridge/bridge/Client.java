package bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen bpen = new BigPen();
		bpen.setColor(new Red());
		bpen.draw("õ��");
		bpen.setColor(new Black());
		bpen.draw("è");
		Pen spen = new SmallPen();
		spen.setColor(new Silver());
		spen.draw("ʮ�ּ�");
	}

}
