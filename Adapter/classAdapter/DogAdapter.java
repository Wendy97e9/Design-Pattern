package classAdapter;

public class DogAdapter extends Dog implements Robot {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.print("������ģ�£�");
		super.wang();

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.print("������ģ�£�");
		super.run();

	}

}
