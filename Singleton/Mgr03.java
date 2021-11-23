// lazy loading
// 懒加载
// 线程不安全
public class Mgr03 {
	private static Mgr03 INSTANCE;
	
	private Mgr03() {};
	
	public static Mgr03 getInstance()
	{
		if(INSTANCE == null)
		{
			try {
				Thread.sleep(1);
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			INSTANCE = new Mgr03();
		}
		return INSTANCE;
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)
		{
			//java8 lambda表达式
			//对于只有一个方法的匿名内部类的简化
			//不同对象的hashcode不同
			new Thread(()->{
				System.out.println(Mgr03.getInstance().hashCode());
			}).start();
		}
	}
}
