package templateMethodBank;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTemplateMethod bank = new Deposit();
		bank.process();
		bank = new Withdraw();
		bank.process();
		bank = new Transfer();
		bank.process();
	}

}
