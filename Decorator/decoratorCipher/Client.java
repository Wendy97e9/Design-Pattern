// 客户端可以一致的使用Cipher的具体对象，透明
package decoratorCipher;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "abbey0212";
		Cipher sc,cc,ac;
		
		sc = new SimpleCipher();
		sc.encrypt(password);
		System.out.println("------------------------------------------");
		// 对simple加密的sc进行complex加密
		cc = new ComplexCipher(sc);
		cc.encrypt(password);
		System.out.println("------------------------------------------");
		// 对装饰过的cc进一步进行advanced加密
		ac = new AdvancedCipher(cc);
		ac.encrypt(password);
		System.out.println("------------------------------------------");
		
	}

}
