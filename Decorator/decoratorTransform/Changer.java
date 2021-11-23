package decoratorTransform;

public class Changer implements Transform {
	
	private Transform transform;
	
	public Changer(Transform transform)
	{
		this.transform = transform;	//�ۺ�
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		transform.move();
	}

}
