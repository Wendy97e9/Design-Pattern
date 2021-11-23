package decoratorTransform;

public final class Car implements Transform {

	public Car() {
		// TODO Auto-generated method stub
		System.out.println("变形金刚是一辆车。");
	}
	
	public void move()
	{
		System.out.println("在陆地上移动。");
	}

}
