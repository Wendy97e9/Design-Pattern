package animalObserver;

public class Cat extends MySubject {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Γ¨ίχίχ½Π‘£");
		for(Object obs:observers)
		{
			((MyObserver)obs).response();
		}
	}

}
