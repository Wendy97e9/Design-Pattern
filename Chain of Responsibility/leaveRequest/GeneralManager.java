package leaveRequest;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if (request.getLeaveDays()<25)
		{
			System.out.println("�ܾ��� "+name+" ����ͨ�� "+request.getStuffName()+" ��� "+request.getLeaveDays());
		}
		else
		{
			System.out.println("�ܾ��� "+name+" ��ͬ�� "+request.getStuffName()+" ��� "+request.getLeaveDays());
		}
	}

}
