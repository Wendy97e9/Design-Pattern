package classAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot rb = new DogAdapter();	//里氏替换原则，不可以new Robot()，Robot是Interface
		rb.cry();
		rb.move();
		rb = new BirdAdapter();
		rb.cry();
		rb.move();		
	}

}
