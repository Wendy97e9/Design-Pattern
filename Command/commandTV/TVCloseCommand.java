package commandTV;

public class TVCloseCommand implements AbstractCommand {

	private Television tv;
	
	public TVCloseCommand()
	{
		tv = new Television();
	}
	@Override
	public void exectute() {
		// TODO Auto-generated method stub
		tv.close();
	}

}
