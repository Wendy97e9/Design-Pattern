package templateMethodBank;

public abstract class BankTemplateMethod {
	
	public void takeNumber()
	{
		System.out.println("ȡ���Ŷ�");
	}
	
	public boolean isGet() 
	{
		return true;
	}
	
	public void checkpwd()
	{
		System.out.println("��������");
	}
	
	public abstract void transact();

	public void process()
	{
		this.takeNumber();
		if(isGet())
		{
			checkpwd();
		}
		transact();
	}
}
