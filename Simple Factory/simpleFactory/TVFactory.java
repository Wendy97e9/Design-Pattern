package simpleFactory;


public class TVFactory {

	public TV produceTV(String brand)
	{
		if(brand=="Haier")
		{
			return new HaierTV();
		}
		else if(brand=="Hisense")
		{
			return new HisenseTV();
		}
		return null;
	}

}
