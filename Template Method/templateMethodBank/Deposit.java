package templateMethodBank;

public class Deposit extends BankTemplateMethod {
	public boolean isGet()
	{
		return false;
	}

	@Override
	public void transact() {
		// TODO Auto-generated method stub
		System.out.println("´æ¿î");

	}

}
