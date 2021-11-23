package builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KFCWaiter waiter = new KFCWaiter();
		waiter.setMb(new SubMealBuilderA());
		System.out.println(waiter.construct().toString());
		waiter.setMb(new SubMealBuilderB());
		System.out.println(waiter.construct().toString());
	}

}
