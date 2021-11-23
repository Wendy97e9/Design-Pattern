// 缩小同步区域，使用synchronized同步代码块，但无法实现单例
public class Mgr05 {
	private static Mgr05 INSTANCE;
	
	private Mgr05() {};
	
	public static Mgr05 getInstance()
	{
		if(INSTANCE == null)
		{
			synchronized (Mgr05.class) {
				try {
					Thread.sleep(1);
				} catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				INSTANCE = new Mgr05();
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
				System.out.println(Mgr05.getInstance().hashCode());
			}).start();
		}
	}
}
