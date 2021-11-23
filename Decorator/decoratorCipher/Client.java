// �ͻ��˿���һ�µ�ʹ��Cipher�ľ������͸��
package decoratorCipher;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "abbey0212";
		Cipher sc,cc,ac;
		
		sc = new SimpleCipher();
		sc.encrypt(password);
		System.out.println("------------------------------------------");
		// ��simple���ܵ�sc����complex����
		cc = new ComplexCipher(sc);
		cc.encrypt(password);
		System.out.println("------------------------------------------");
		// ��װ�ι���cc��һ������advanced����
		ac = new AdvancedCipher(cc);
		ac.encrypt(password);
		System.out.println("------------------------------------------");
		
	}

}
