// 双判断锁
// volatile针对语句重排
// 不能避免反序列化
public class Mgr06 {
	private static volatile Mgr06 INSTANCE;
	
	private Mgr06() {};
	
	public static Mgr06 getInstance()
	{
		if(INSTANCE == null)
		{
			synchronized (Mgr06.class) {
				if(INSTANCE == null)
				{
					try {
						Thread.sleep(1);
					} catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					INSTANCE = new Mgr06();
				}
			}
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
				System.out.println(Mgr06.getInstance().hashCode());
			}).start();
		}
	}
}

