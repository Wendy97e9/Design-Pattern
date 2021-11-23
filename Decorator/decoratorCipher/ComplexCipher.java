package decoratorCipher;

public class ComplexCipher extends CipherDecorator {

	public ComplexCipher(Cipher cipher) {
		super(cipher);
		// TODO Auto-generated constructor stub
	}
	
	public void encrypt(String plainText)
	{
		super.encrypt(plainText);
		reverse(plainText);
	}
	
	public void reverse(String plainText)
	{
		System.out.println("∏¥‘”º”√‹reverse£∫"+plainText);
	}

}
