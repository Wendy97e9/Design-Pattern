package abstractFactory;

public class TCLFactory implements EFactory {

	@Override
	public TV produceTV() {
		// TODO Auto-generated method stub
		return new TCLTV();
	}

	@Override
	public AC produceAC() {
		// TODO Auto-generated method stub
		return new TCLAC();
	}

}
