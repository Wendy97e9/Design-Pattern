package builder;

public class SubMealBuilderB extends MealBuilder {

	@Override
	public void buildFood() {
		// TODO Auto-generated method stub
		this.getMeal().setFood("����");

	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		this.getMeal().setDrink("����");
	}

}
