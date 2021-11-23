//枚举单例，不仅解决线程同步，还可以防止反序列化
// enum反编译是abstract class
public enum Mgr08 {

	INSTANCE;
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)
		{
			//java8 lambda表达式
			//对于只有一个方法的匿名内部类的简化
			//不同对象的hashcode不同
			new Thread(()->{
				System.out.println(Mgr08.INSTANCE.hashCode());
			}).start();
		}
	}
}
