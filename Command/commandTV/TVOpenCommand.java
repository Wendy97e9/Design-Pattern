package commandTV;

public class TVOpenCommand implements AbstractCommand {

	private Television tv;
	
	public TVOpenCommand()
	{
		tv = new Television();
	}
	
	@Override
	public void exectute() {
		// TODO Auto-generated method stub
		tv.open();
	}

}
