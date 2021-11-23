package leaveRequest;

public class LeaveRequest {
	
	private String stuffName;
	private int leaveDays;
	
	public String getStuffName() {
		return stuffName;
	}

	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public LeaveRequest(String stuffName, int leaveDays)
	{
		this.stuffName = stuffName;
		this.leaveDays = leaveDays;
	}

}
