package decoratorCipher;

public class AdvancedCipher extends CipherDecorator {

	public AdvancedCipher(Cipher cipher) {
		super(cipher);
		// TODO Auto-generated constructor stub
	}
	
	public void encrypt(String plainText)
	{
		super.encrypt(plainText);
		mod(plainText);
	}
	
	public void mod(String plainText)
	{
		System.out.println("∏ﬂº∂º”√‹mod£∫"+plainText);
	}

}
