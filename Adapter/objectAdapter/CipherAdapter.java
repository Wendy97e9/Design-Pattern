package objectAdapter;

public class CipherAdapter extends DataOperator {

	private Caeser cipher;
	
	public CipherAdapter()
	{
		cipher = new Caeser();
	}
	
	@Override
	public String doEncrypt(int key, String ps) {
		// TODO Auto-generated method stub
		return cipher.doEncrypt(key, ps);
	}

}
