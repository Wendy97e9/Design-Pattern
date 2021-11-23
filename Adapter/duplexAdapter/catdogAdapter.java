package duplexAdapter;

public class catdogAdapter implements ICat,IDog {
	
	private ICat cat;
	private IDog dog;
	
	public catdogAdapter()
	{
		cat = new Cat();
		dog = new Dog();
	}
	
	public void catWork()
	{
		cat.catWork();
		System.out.print("Ã¨Ä£·Â£º");
		dog.dogWork();
	}
	
	public void dogWork()
	{
		dog.dogWork();
		System.out.print("¹·Ä£·Â£º");
		cat.catWork();
	}
}
