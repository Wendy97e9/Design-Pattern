package commandTV;

public class TVChangeCommand implements AbstractCommand {

	private Television tv;
	
	public TVChangeCommand()
	{
		tv = new Television();
	}
	@Override
	public void exectute() {
		// TODO Auto-generated method stub
		tv.change();
	}

}
