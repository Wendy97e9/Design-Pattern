// ��͸��װ��ģʽ
package decoratorTransform;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transform camaro;
		camaro = new Car();
		camaro.move();
		Robot bumblebee = new Robot(camaro);	// �����û��ڿͻ�����������װ�������͵Ķ��󣬵��þ��巽��
		bumblebee.move();
		bumblebee.say();
	}

}
