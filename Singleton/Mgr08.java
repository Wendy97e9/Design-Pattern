//ö�ٵ�������������߳�ͬ���������Է�ֹ�����л�
// enum��������abstract class
public enum Mgr08 {

	INSTANCE;
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)
		{
			//java8 lambda���ʽ
			//����ֻ��һ�������������ڲ���ļ�
			//��ͬ�����hashcode��ͬ
			new Thread(()->{
				System.out.println(Mgr08.INSTANCE.hashCode());
			}).start();
		}
	}
}
