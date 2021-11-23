package classAdapter;

public class BirdAdapter extends Bird implements Robot {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.print("机器人模仿：");
		super.tweedle();

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.print("机器人模仿：");
		super.fly();
	}

}
