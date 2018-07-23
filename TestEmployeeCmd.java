class Employee
{
	String name;
	int e_id;
	float salary;
	boolean status;
	
	void setData(String a[])
	{
		name=a[0];
		e_id=Integer.parseInt(a[1]);
		salary=Float.parseFloat(a[2]);
		status=Boolean.parseBoolean(a[3]);
		
	}
	void getData()
	{
		System.out.println("Name:"+name+"\nEmp Id:"+e_id+"\nSalary:"+salary+"\nStatus:"+status);
	}
}

/*** Main Class***/

class TestEmployeeCmd
{
	public static void main(String args[])
	{
		
		Employee e = new Employee();
		e.setData(args);
		e.getData();
	} 
}