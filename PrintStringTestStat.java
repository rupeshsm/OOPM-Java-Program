/** Object Oriented Program to Display Text Message **/
class PrintString
{
	
	static void displayText()   // Defining static method
	{
		System.out.println("Hello, World :) ");
	}
}

/*** Main Class***/

class PrintStringTestStat
{
	public static void main(String args[])
	{
		
		PrintString.displayText(); // Calling static method from object name
		
	} 
}