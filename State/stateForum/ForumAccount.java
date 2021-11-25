package stateForum;

public class ForumAccount {
	private String name;
	private AbstractState state;
	
	public ForumAccount(String name)
	{
		this.name = name;


		// ???
		this.state = new PrimaryState(this);
		System.out.println(this.name + "×¢²á³É¹¦¡£");
		String str = state.acc.name;
		System.out.println(str);
	}
	
	public void downloadFile(int score)
	{
		state.downloadFile(score);
	}
	
	public void writeNote(int score)
	{
		state.writeNote(score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractState getState() {
		return state;
	}

	public void setState(AbstractState state) {
		this.state = state;
	}
	

}
