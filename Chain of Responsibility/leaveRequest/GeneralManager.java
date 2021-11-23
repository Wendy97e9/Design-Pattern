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
			System.out.println("总经理 "+name+" 审批通过 "+request.getStuffName()+" 请假 "+request.getLeaveDays());
		}
		else
		{
			System.out.println("总经理 "+name+" 不同意 "+request.getStuffName()+" 请假 "+request.getLeaveDays());
		}
	}

}
