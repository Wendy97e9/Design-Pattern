package factoryMethod;

public class TCLTVFactory implements TVFactory {

	@Override
	public TV produceTV() {
		// TODO Auto-generated method stub
		return new TCLTV();
	}

}
