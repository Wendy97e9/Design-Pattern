package simpleFactory;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVFactory tvf = new TVFactory();
		TV tv = tvf.produceTV("Haier");
		tv.play();
		tv = tvf.produceTV("Hisense");
		tv.play();		
	}

}
