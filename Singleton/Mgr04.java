
public class Mgr04 {
	private static Mgr04 INSTANCE;
	
	private Mgr04() {};
	
	public synchronized static  Mgr04 getInstance()
	{
		if(INSTANCE == null)
		{
			try {
				Thread.sleep(1);
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			INSTANCE = new Mgr04();
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++)
		{
			//java8 lambda表达式
			//对于只有一个方法的匿名内部类的简化
			//不同对象的hashcode不同
			new Thread(()->{
				System.out.println(Mgr04.getInstance().hashCode());
			}).start();
		}
	}

}
