package templateMethodBank;

public abstract class BankTemplateMethod {
	
	public void takeNumber()
	{
		System.out.println("È¡ºÅÅÅ¶Ó");
	}
	
	public boolean isGet() 
	{
		return true;
	}
	
	public void checkpwd()
	{
		System.out.println("ºËÑéÃÜÂë");
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
