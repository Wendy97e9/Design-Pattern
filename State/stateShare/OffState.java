package stateShare;

public class OffState implements State {

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("�򿪡�");
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ��رա�");
	}

}
