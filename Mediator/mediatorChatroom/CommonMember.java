package mediatorChatroom;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String to, String text) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ�û� " + this.name + " �� " + to + " �����ı�: ");
		chatroom.sendText(name, to, text);
	}

	@Override
	public void sendImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ�û����ܷ���ͼƬ!");
	}

}
