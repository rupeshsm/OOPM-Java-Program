import java.util.Scanner;
class Employee
{
	String name;
	int e_id;
	float salary;
	boolean status;
	
	Scanner sc = new Scanner(System.in);
	void setData()
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
	Employee copyEmployee(Employee e)	//Mehod with objects
	{
		Employee de = e;
		return de;
	}
}

/*** Main Class***/

class TestEmployeeObject
{
	public static void main(String args[])
	{
		
		Employee e = new Employee();
		e.setData();
		System.out.println("\n\n Details of  Employee : "+e.name );
		e.getData();
		Employee ecopy = e.copyEmployee(e);
		System.out.println("\n\n Details of copy of Employee : "+e.name );
		ecopy.getData();
		
	} 
}