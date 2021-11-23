// Ç³¿½±´
package shadowCopy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e1 = new Email();
//		e1.setAttachment(new Attachment());
		Email e2 = (Email)e1.clone();
		System.out.println("Email e1:");
		e1.display();
		System.out.println("Email e2:");
		e2.display();
	}

}
