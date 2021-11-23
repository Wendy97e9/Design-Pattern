package protectProxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractPermission permission = new PermissionProxy();
		permission.setLevel(0);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("------------------------------");
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
	}

}
