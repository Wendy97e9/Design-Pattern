package classAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot rb = new DogAdapter();	//�����滻ԭ�򣬲�����new Robot()��Robot��Interface
		rb.cry();
		rb.move();
		rb = new BirdAdapter();
		rb.cry();
		rb.move();		
	}

}
