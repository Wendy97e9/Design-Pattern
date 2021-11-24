package mediatorChatroom;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChatroom chatroom = new ChatGroup();
		Member m1, m2, m3;
		m1 = new DiamondMember("DAAA");
		m2 = new CommonMember("CBBB");
		m3 = new CommonMember("CCCC");
		chatroom.register(m1);
		chatroom.register(m2);
		chatroom.register(m3);
		m1.sendImage("CBBB", "��Ů");
		m2.sendImage("CCCC", "��Ů");
		m1.sendText("CCCC", "����Ư��");
		m2.sendText("DAAA", "��˵�ö�");
		m3.sendText("DAAA", "������˵ʲô");
		m3.sendImage("CBBB", "����.jpg");
	}

}
