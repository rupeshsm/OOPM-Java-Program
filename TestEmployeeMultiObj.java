import java.util.Scanner;
class Employee
{
	String name;
	int e_id;
	float salary;
	boolean status;
	Scanner sc = new Scanner(System.in);
	void setData(String a[])
	{
		
		System.out.println("Enter Name (String) of Employee: " );
		name=sc.nextLine();
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

class TestEmployeeMultiObj
{
	public static void main(String args[])
	{
		
		Employee e1 = new Employee();
		e1.setData();
		
		Employee e2 = new Employee();
		e2.setData(args);
		System.out.println("Details of "+e1.name );
		e1.getData();
		System.out.println("Details of "+e2.name );
		e2.getData();
	} 
}