package compositeFruit;

import java.util.*;

public class Plate extends MyElement {

	private ArrayList list = new ArrayList();
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		for(Object o:list)
		{
			((MyElement)o).eat();
		}
	}
	
	public void add(MyElement element)
	{
		list.add(element);
	}
	
	public void remove(MyElement element)
	{
		list.remove(element);
	}

}
