package commandTV;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCommand openCommand, closeCommand, changeCommand;
		openCommand = new TVOpenCommand();
		closeCommand = new TVCloseCommand();
		changeCommand = new TVChangeCommand();
		Controller controller = new Controller(openCommand, closeCommand, changeCommand);
		controller.open();
		controller.change();
		controller.close();
	}

}
