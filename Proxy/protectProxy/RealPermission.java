package protectProxy;

public class RealPermission implements AbstractPermission {

	public void modifyUserInfo() {
		// TODO Auto-generated method stub
		System.out.println("�޸��û���Ϣ��");

	}

	@Override
	public void viewNote() {
		// TODO Auto-generated method stub
		System.out.println("�鿴���ӡ�");

	}

	@Override
	public void publishNote() {
		// TODO Auto-generated method stub
		System.out.println("�������ӡ�");

	}

	@Override
	public void modifyNote() {
		// TODO Auto-generated method stub
		System.out.println("�޸����ӡ�");

	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		//
	}

}
