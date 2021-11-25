package stateShare;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Switch s1, s2;
		s1 = new Switch("开关1");
		s2 = new Switch("开关2");
		s1.off();
//		s2.off();
		Switch s3 = new Switch("开关3");
		s3.off();
		s2.on();
		s1.on();
		s3.on();
	}

}
