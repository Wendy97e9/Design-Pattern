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
			System.out.println("经理 "+name+" 审批通过 "+request.getStuffName()+" 请假 "+request.getLeaveDays());
		}
		else
		{
			this.successor.handleRequest(request);
		}

	}

}
