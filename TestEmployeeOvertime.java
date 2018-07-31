import java.util.Scanner;
class Employee
{
	String name;
	int e_id;
	float salary;
	boolean status;
	float work_hrs;
	Scanner sc = new Scanner(System.in);
	void setData()
	{
		
		System.out.println("Enter Name (String) of Employee: " );
		name=sc.nextLine();
		System.out.println("Enter Employee ID (Integer) of Employee: " );
		e_id=sc.nextInt();
		System.out.println("Enter Working Hours(Float) of Employee: " );
		work_hrs=sc.nextFloat();
		System.out.println("Enter Salary (Float) of Employee: " );
		salary=sc.nextFloat();
		System.out.println("Enter Working Satus (Boolean) of Employee: " );
		status=sc.nextBoolean();
		
	}
	void getData()
	{
		System.out.println("Name:"+name+"\nEmp Id:"+e_id+"\nSalary:"+salary+"\nStatus:"+status);
	}
	float overtime(float time)
	{
		float ot = work_hrs-time;
		return ot; 
	}
}

/*** Main Class***/

class TestEmployeeOvertime
{
	public static void main(String args[])
	{
		
		Employee e = new Employee();
		e.setData();
		e.getData();
		System.out.println("Enter  working hour for the Month: ");
		Scanner sc = new Scanner(System.in);
		float time = sc.nextFloat();
		float ot = e.overtime(float time);
		if(ot > 0)
		{
			System.out.println(e.name +" worked "+ot+" Hrs Extra");
		}
		else
		{
			System.out.println(e.name +" Not qualified for extra pay");
		}
		
	} 
}