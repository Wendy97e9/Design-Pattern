package leaveRequest;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leader director, manager, generalmanager;
		director = new Director("Ada");
		manager = new Manager("Bob");
		generalmanager = new GeneralManager("Cindy");
		director.setSuccessor(manager);
		manager.setSuccessor(generalmanager);
		
		LeaveRequest r1,r2,r3,r4;
		r1 = new LeaveRequest("111",11);
		r2 = new LeaveRequest("222",22);
		r3 = new LeaveRequest("333",1);
		r4 = new LeaveRequest("444",44);
		
		director.handleRequest(r1);
		director.handleRequest(r2);
		director.handleRequest(r3);
		director.handleRequest(r4);
				
	}

}
