package stateShare;

public class OnState implements State {

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ��򿪡�");
	}

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("�رա�");
		s.setState(Switch.getState("off"));
	}
	

}
