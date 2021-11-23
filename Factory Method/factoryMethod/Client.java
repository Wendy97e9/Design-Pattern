package factoryMethod;

public class Client {

	public static void main(String[] args)
	{
		TVFactory tvf = new HaierTVFactory();
		TV tv = tvf.produceTV();
		tv.play();
		tvf = new HisenseTVFactory();
		tv = tvf.produceTV();
		tv.play();
		tvf = new TCLTVFactory();
		tv = tvf.produceTV();
		tv.play();
	}
}
