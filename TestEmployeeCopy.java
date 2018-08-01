import java.util.Scanner;
class Employee
{
	private String name;
	private int e_id;
	private float salary;
	private boolean status;
	
	Employee()
	{
		name="Test";		//Default Constructure Definition
		e_id=0;
		salary=10000.50;
		status=false;
		
	}
	Employee(String name, int e_id, float salary, boolean status)
	{
		this.name=name;		//Parameterised Constructor
		this.e_id=e_id;
		this.salary=salary;
		this.status=status;
		
	}

	Employee(Employee e)	//Copy Constructor
	{
		name=e.name;
		e_id=e.e_id;
		salary=e.salary;
		status=e.status;
		
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name (String) of Employee: " );
		String name=sc.nextLine();
		System.out.println("Enter Employee ID (Integer) of Employee: " );
		int e_id=sc.nextInt();
		System.out.println("Enter Salary (Float) of Employee: " );
		float salary=sc.nextFloat();
		System.out.println("Enter Working Satus (Boolean) of Employee: " );
		boolean status=sc.nextBoolean();

		Employee e1 = new Employee(name,e_id,salary,status);
		Employee e1_backup = new Employee(e1);
		
		System.out.println("\n\n Details of Employee:"+e.name );
		e.getData();
		System.out.println("\n\n Backup Details of Employee:"+e.name );
		e.getData();
	} 
}