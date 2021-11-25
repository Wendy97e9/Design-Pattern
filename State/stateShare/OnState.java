package stateShare;

public class OnState implements State {

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("已经打开。");
	}

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("关闭。");
		s.setState(Switch.getState("off"));
	}
	

}
