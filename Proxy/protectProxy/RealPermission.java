package protectProxy;

public class RealPermission implements AbstractPermission {

	public void modifyUserInfo() {
		// TODO Auto-generated method stub
		System.out.println("修改用户信息。");

	}

	@Override
	public void viewNote() {
		// TODO Auto-generated method stub
		System.out.println("查看帖子。");

	}

	@Override
	public void publishNote() {
		// TODO Auto-generated method stub
		System.out.println("发表帖子。");

	}

	@Override
	public void modifyNote() {
		// TODO Auto-generated method stub
		System.out.println("修改帖子。");

	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		//
	}

}
