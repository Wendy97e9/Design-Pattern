package stateForum;

public abstract class AbstractState {
	protected ForumAccount acc;
	protected int point;
	protected String stateName;

	public abstract void checkState();
	
	public void downloadFile(int score)
	{
		System.out.println("�����ļ�");
	}
	
	public void writeNote(int score)
	{
		System.out.println("������Ϣ");
	}
}
