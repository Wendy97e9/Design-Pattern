package decoratorCipher;

public class CipherDecorator implements Cipher {
	
	private Cipher cipher;
	
	public CipherDecorator(Cipher cipher)
	{
		this.cipher = cipher;
	}

	@Override
	public void encrypt(String plainText) {
		// TODO Auto-generated method stub
		cipher.encrypt(plainText);
	}
	

}
