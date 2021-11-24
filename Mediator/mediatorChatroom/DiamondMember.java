package mediatorChatroom;

public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String to, String text) {
		// TODO Auto-generated method stub
		System.out.println("��ʯ�û� " + this.name + " �� " + to + " �����ı�: ");
		chatroom.sendText(name, to, text);
	}

	@Override
	public void sendImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("��ʯ�û� " + this.name + " �� " + to + " ����ͼƬ: ");
		chatroom.sendText(name, to, image);
	}

}
