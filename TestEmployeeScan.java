import java.util.Scanner;		//importing Scanner class from util package
class Employee
{
	String name;
	int e_id;
	float salary;
	boolean status;
	Scanner sc = new Scanner(System.in);	//Creating Object for the call Scanner
	void setData()
	{
		
		System.out.println("Enter Name (String) of Employee: " );
		name=sc.nextLine();				// Methood to accept String from user
		System.out.println("Enter Employee ID (Integer) of Employee: " );
		e_id=sc.nextInt();
		System.out.println("Enter Salary (Float) of Employee: " );
		salary=sc.nextFloat();
		System.out.println("Enter Working Satus (Boolean) of Employee: " );
		status=sc.nextBoolean();
		
	}
	void getData()
	{
		System.out.println("Name:"+name+"\nEmp Id:"+e_id+"\nSalary:"+salary+"\nStatus:"+status);
	}
}

/*** Main Class***/

class TestEmployeeScan
{
	public static void main(String args[])
	{
		
		Employee e = new Employee();
		e.setData();
		e.getData();
	} 
}
