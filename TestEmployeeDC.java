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
		
		
		Employee e = new Employee();	//Constructor Call
		
		e.getData();		// To display default vaue assigned by the constructor to the varable of object e
	} 
}
