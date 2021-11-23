// 使用了static{}静态代码块
// 本质和Mgr1是一样的

public class Mgr02 {
	private static final Mgr02 INSTANCE;
	static {
		INSTANCE = new Mgr02();
	}
	
	private Mgr02() {
		
	};
	
	public static Mgr02 getInstance()
	{
		return INSTANCE;
	}
	
	public static void main(String[] args)
	{
		Mgr01 m1 = Mgr01.getInstance();
		Mgr01 m2 = Mgr01.getInstance();
		System.out.println(m1 == m2);
	}
}
