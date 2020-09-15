
public class EmployeeDetails {
	
	int employeeid,doj;
	String employeename,emailid;
	static String orgname;
	

	public static void main(String[] args) {
		
		
		EmployeeDetails emp1=new EmployeeDetails();
		emp1.employeeid=12345;
		emp1.doj=12/12/12;
		emp1.employeename="arun";
		emp1.orgname="TCS";
		emp1.emailid="arun@tcs.com";
		
		
		EmployeeDetails emp2=new EmployeeDetails();
		emp2.employeeid=32344;
		emp1.doj=12/11/12;
		emp1.employeename="kumar";
		emp1.orgname="TCS";
		emp1.emailid="kmar@tcs.com";
		
		EmployeeDetails emp3=new EmployeeDetails();
		emp1.employeeid=43342;
		emp1.doj=10/12/12;
		emp1.employeename="sanjay";
		emp1.orgname="TCS";
		emp1.emailid="sanjay@tcs.com";
		
		
		
		

	}

}
