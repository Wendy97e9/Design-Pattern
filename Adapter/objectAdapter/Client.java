package objectAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOperator dao = new CipherAdapter();
		dao.setPassword("sunnyLiu");
		String ps = dao.getPassword();
		String es = dao.doEncrypt(6, ps);
		System.out.println("���ģ�"+ps);
		System.out.println("���ģ�"+es);
	}

}
