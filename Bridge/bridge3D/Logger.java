package bridge3D;

public class Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationSystem win10 = new Windows();
		win10.setLanguage(new JavaLanguage());
		win10.setFormat(new PDF());
		win10.write();
	}

}
