// 静态内部类
// JVM保证单例
public class Mgr07 {
	
	private Mgr07() {}
	
	private static class Mgr07Holder 
	{
		private final static Mgr07 INSTANCE = new Mgr07();
	}
	
	public static Mgr07 getInstance()
	{
		return Mgr07Holder.INSTANCE;
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)
		{
			//java8 lambda表达式
			//对于只有一个方法的匿名内部类的简化
			//不同对象的hashcode不同
			new Thread(()->{
				System.out.println(Mgr07.getInstance().hashCode());
			}).start();
		}
	}
}
