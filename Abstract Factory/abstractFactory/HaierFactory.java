package abstractFactory;

public class HaierFactory implements EFactory {

	@Override
	public TV produceTV() {
		// TODO Auto-generated method stub
		return new HaierTV();
	}

	@Override
	public AC produceAC() {
		// TODO Auto-generated method stub
		return new HaierAC();
	}

}
