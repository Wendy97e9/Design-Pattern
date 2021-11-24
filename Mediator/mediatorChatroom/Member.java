package mediatorChatroom;

public abstract class Member {
	protected AbstractChatroom chatroom;
	protected String name;
	
	public Member(String name)
	{
		this.name = name;
	}
	
	public abstract void sendText(String to, String text);
	public abstract void sendImage(String to, String image);
	
	public void receiveText(String from, String text)
	{
		System.out.println(this.name + " 收到来自 " + from + " 的文本: " + text);
	}
	
	public void receiveImage(String from, String image)
	{
		System.out.println(this.name + " 收到来自 " + from + " 的图片: " + image);
	}

	public AbstractChatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
