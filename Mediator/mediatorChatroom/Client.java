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
		m1.sendImage("CBBB", "美女");
		m2.sendImage("CCCC", "美女");
		m1.sendText("CCCC", "她真漂亮");
		m2.sendText("DAAA", "你说得对");
		m3.sendText("DAAA", "你们在说什么");
		m3.sendImage("CBBB", "好奇.jpg");
	}

}
