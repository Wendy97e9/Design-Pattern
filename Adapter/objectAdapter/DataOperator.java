package objectAdapter;

public abstract class DataOperator {
	
	private String password;
	
	public abstract String doEncrypt(int key, String ps);

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
