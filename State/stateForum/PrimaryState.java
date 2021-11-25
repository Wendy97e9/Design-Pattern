package stateForum;

public class PrimaryState extends AbstractState {
	
	public PrimaryState(AbstractState state)
	{
		this.acc = state.acc;
		this.point = state.point;
		this.stateName = "�����û�";
	}
	
	public PrimaryState(ForumAccount acc)
	{
		this.acc = acc;
		this.point = 0;
		this.stateName = "�����û�";
	}

	@Override
	public void checkState() {
		
		// TODO Auto-generated method stub
		if(this.point < 100)
		{
			
		}
		else if(this.point >= 100 && this.point < 200)
		{
			acc.setState(new MiddleState(this));
		}
		else
		{
			acc.setState(new HighState(this));
		}
		System.out.println("��ǰ�˺ŵĵȼ��� "+this.acc.getState().stateName);

	}
	
	public void downloadFile(int score)
	{
		System.out.println(this.stateName+this.acc.getName() + " �����ļ�:");
		System.out.println("���ѻ��� "+score);
		if(this.point >= score)
		{
			this.point -= score;
		}else
		{
			System.out.println("���ֲ��㣬����ʧ�ܡ�");
		}
		
		checkState();
		
	}
	
	public void writeNote(int score)
	{
		System.out.println(this.stateName+this.acc.getName() + " ������Ϣ:");
		System.out.println("��û��� "+score);
		this.point += score;
		checkState();
	}

}
