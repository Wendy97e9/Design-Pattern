package mediatorChatroom;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {

	private Hashtable members = new Hashtable();
	public ChatGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(Member member) {
		// TODO Auto-generated method stub
		members.put(member.getName(),member);
		member.setChatroom(this);
	}

	@Override
	public void sendText(String from, String to, String text) {
		// TODO Auto-generated method stub
		Member member = (Member)members.get(to);
		member.receiveText(from, text);

	}

	@Override
	public void sendImage(String from, String to, String image) {
		// TODO Auto-generated method stub
		Member member = (Member)members.get(to);
		member.receiveImage(from, image);

	}

}
