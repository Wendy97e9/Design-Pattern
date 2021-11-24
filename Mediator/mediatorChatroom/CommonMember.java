package mediatorChatroom;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String to, String text) {
		// TODO Auto-generated method stub
		System.out.println("普通用户 " + this.name + " 向 " + to + " 发送文本: ");
		chatroom.sendText(name, to, text);
	}

	@Override
	public void sendImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("普通用户不能发送图片!");
	}

}
