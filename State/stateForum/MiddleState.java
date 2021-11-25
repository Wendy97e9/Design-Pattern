package stateForum;

public class MiddleState extends AbstractState {

	public MiddleState(AbstractState state)
	{
		this.acc = state.acc;
		this.point = state.point;
		this.stateName = "中级用户";
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
		System.out.println("当前账号的等级是 "+this.acc.getState().stateName);
	}
	
	public void downloadFile(int score)
	{
		System.out.println(this.stateName+this.acc.getName() + " 下载文件:");
		System.out.println("花费积分(50% off) "+score/2);
		if(this.point >= score/2)
		{
			this.point -= score/2;
		}else
		{
			System.out.println("积分不足，下载失败。");
		}
		checkState();
		
	}
	
	public void writeNote(int score)
	{
		System.out.println(this.stateName+this.acc.getName() + " 发布消息:");
		System.out.println("获得积分 "+score);
		this.point += score;
		checkState();
	}

}
