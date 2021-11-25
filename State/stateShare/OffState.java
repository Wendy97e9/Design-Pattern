package stateShare;

public class OffState implements State {

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("打开。");
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("已经关闭。");
	}

}
