// ��Сͬ������ʹ��synchronizedͬ������飬���޷�ʵ�ֵ���
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
			//java8 lambda���ʽ
			//����ֻ��һ�������������ڲ���ļ�
			//��ͬ�����hashcode��ͬ
			new Thread(()->{
				System.out.println(Mgr05.getInstance().hashCode());
			}).start();
		}
	}
}
