package decoratorTransform;

public class Robot extends Changer {
	
	public Robot(Transform transform)
	{
		super(transform);
		System.out.println("��ɻ����ˡ�");
	}
	
	public void say()
	{
		System.out.println("˵����");
	}

}
