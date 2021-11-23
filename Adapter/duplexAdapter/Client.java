package duplexAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICat cat = new catdogAdapter();
		cat.catWork();
		IDog dog = new catdogAdapter();
		dog.dogWork();
	}

}
