package stateForum;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForumAccount acc = new ForumAccount("¿Ô√¿");
		acc.downloadFile(20);
		acc.writeNote(40);
		acc.writeNote(60);
		acc.downloadFile(20);
		acc.writeNote(100);
		acc.writeNote(10);
		acc.writeNote(20);
		acc.downloadFile(10);
	}

}
