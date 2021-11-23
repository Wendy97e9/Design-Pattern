package builder;

public class KFCWaiter {

	private MealBuilder mb;

	public MealBuilder getMb() {
		return mb;
	}

	public void setMb(MealBuilder mb) {
		this.mb = mb;
	}
	
	public Meal construct()
	{
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}
}
