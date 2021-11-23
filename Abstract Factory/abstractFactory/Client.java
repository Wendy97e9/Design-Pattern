package abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EFactory Haieref = new HaierFactory();
		Haieref.produceTV().play();
		Haieref.produceAC().changeTemperature();
		EFactory TCLef = new TCLFactory();
		TCLef.produceTV().play();
		TCLef.produceAC().changeTemperature();
	}

}
