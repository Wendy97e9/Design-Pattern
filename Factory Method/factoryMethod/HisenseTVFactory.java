package factoryMethod;

public class HisenseTVFactory implements TVFactory {

	public TV produceTV() {
		// TODO Auto-generated method stub
		return new HisenseTV();
	}

}