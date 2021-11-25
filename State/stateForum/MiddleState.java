package stateForum;

public class MiddleState extends AbstractState {

	public MiddleState(AbstractState state)
	{
		this.acc = state.acc;
		this.point = state.point;
		this.stateName = "�м��û�";
	}
	
	@Override
	public void checkState() {
		// TODO Auto-generated method stub
		if(this.point < 100)
		{
			acc.setState(new PrimaryState(this));
		}
		else if(this.point >= 100 && this.point < 200)
		{
//			acc.setState(new MiddleState(this));
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
		System.out.println("���ѻ���(50% off) "+score/2);
		if(this.point >= score/2)
		{
			this.point -= score/2;
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