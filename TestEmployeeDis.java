import java.io.*;
class Employee
{
	private String name;
	private int e_id;
	private float salary;
	private boolean status;
	DataInputStream sc = new DataInputStream(System.in);
	void setData()throws IOException
	{
		
		System.out.println("Enter Name (String) of Employee: " );
		name=sc.readLine();
		System.out.println("Enter Employee ID (Integer) of Employee: " );
		e_id=Integer.parseInt(sc.readLine());
		System.out.println("Enter Salary (Float) of Employee: " );
		salary=Float.parseFloat(sc.readLine());
		System.out.println("Enter Working Satus (Boolean) of Employee: " );
		status=Boolean.parseBoolean(sc.readLine());
		
	}
	void getData()
	{
		System.out.println("Name:"+name+"\nEmp Id:"+e_id+"\nSalary:"+salary+"\nStatus:"+status);
	}
}

/*** Main Class***/

class TestEmployeeScan
{
	public static void main(String args[])throws IOException
	{
		
		Employee e = new Employee();
		e.setData();
		e.getData();
	} 
}