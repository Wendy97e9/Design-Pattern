package factoryMethod;

public class HaierTVFactory implements TVFactory {

	@Override
	public TV produceTV() {
		// TODO Auto-generated method stub
		return new HaierTV();
	}

}
