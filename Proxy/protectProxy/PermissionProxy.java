package protectProxy;

public class PermissionProxy implements AbstractPermission {
	RealPermission permission = new RealPermission();
	private int level;
	@Override
	public void modifyUserInfo() {
		// TODO Auto-generated method stub
		if(level == 0)
		{
			System.out.println("û��Ȩ���޸��û���Ϣ��");
		}else
		{
			permission.modifyUserInfo();
		}

	}

	@Override
	public void viewNote() {
		// TODO Auto-generated method stub
		permission.viewNote();

	}

	@Override
	public void publishNote() {
		// TODO Auto-generated method stub
		if(level == 0)
		{
			System.out.println("û��Ȩ�޷������ӡ�");
		}else
		{
			permission.modifyUserInfo();
		}
	}

	@Override
	public void modifyNote() {
		// TODO Auto-generated method stub
		if(level == 0)
		{
			System.out.println("û��Ȩ���޸����ӡ�");
		}else
		{
			permission.modifyUserInfo();
		}
	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		this.level = level;
	}

}
