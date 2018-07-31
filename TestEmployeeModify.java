import java.util.Scanner;
class Employee
{
	String name;
	private int e_id;
	private float salary;
	private boolean status;
        
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
	
	void modifyData(String name)  //modifyData methods are overloaded
	{
		this.name = name;
		System.out.println("Name changed successfully " );
	}
	void modifyData(int e_id)
	{
		this.e_id = e_id;
		System.out.println("ID changed successfully " );
	}
	void modifyData(float salary)
	{
		this.salary = salary;
		System.out.println("Salary changed successfully " );
	}
	void modifyData(boolean status , float salary)
	{
		this.status = status;
		if(status == true)
			this.salary = salary;
		else
			this.salary = 0.0f;

		System.out.println("Working Status and Salary changed successfully " );
	}
	void modify(Employee e)
	{
	System.out.println("\nSelect Details to Modify : ");
		System.out.println("\n1. Name \n2.ID \n3. Salary \n4.Status and Salary");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:     System.out.println("Enter new Name (String) of Employee: " );
				String name=sc.nextLine();
				e.modifyData(name);
				break;
			case 2:     System.out.println("Enter new ID (Integer) of Employee: " );
				int e_id=sc.nextInt();
				e.modifyData(e_id);
				break;
			case 3:     System.out.println("Enter new Salary (Float) of Employee: " );
				float salary=sc.nextFloat();
				e.modifyData(salary);
				break;
			case 4:     System.out.println("Enter new status (Boolean) and Salary (Float) of Employee: " );
				boolean status=sc.nextBoolean();
				salary=sc.nextFloat();
				e.modifyData(status, salary);
				break;
			default:     System.out.println("This feature is not yet available" );
		}	
	}
	

}

/*** Main Class***/

class TestEmployeeModify
{
	public static void main(String args[])
	{
		
		Employee e = new Employee();
		
		e.setData();
		System.out.println("Details of :"+e.name);
		e.getData();
		e.modify(e);
		e.getData();
			
	} 
}