package leaveRequest;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if (request.getLeaveDays()<15)
		{
			System.out.println("���� "+name+" ����ͨ�� "+request.getStuffName()+" ��� "+request.getLeaveDays());
		}
		else
		{
			this.successor.handleRequest(request);
		}

	}

}
