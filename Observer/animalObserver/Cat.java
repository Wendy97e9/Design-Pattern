package animalObserver;

public class Cat extends MySubject {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("è�����С�");
		for(Object obs:observers)
		{
			((MyObserver)obs).response();
		}
	}

}
