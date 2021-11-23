package leaveRequest;

public class Director extends Leader {

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void handleRequest(LeaveRequest request)
	{
		if (request.getLeaveDays()<5)
		{
			System.out.println("主任 "+name+" 审批通过 "+request.getStuffName()+" 请假 "+request.getLeaveDays());
		}
		else
		{
			this.successor.handleRequest(request);
		}
	}

}
