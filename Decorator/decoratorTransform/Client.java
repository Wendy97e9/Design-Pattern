// 半透明装饰模式
package decoratorTransform;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transform camaro;
		camaro = new Car();
		camaro.move();
		Robot bumblebee = new Robot(camaro);	// 允许用户在客户端声明具体装饰者类型的对象，调用具体方法
		bumblebee.move();
		bumblebee.say();
	}

}
