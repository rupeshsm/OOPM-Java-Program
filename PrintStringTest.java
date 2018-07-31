/** Object Oriented Program to Display Text Message **/
class PrintString
{
	
	void displayText()
	{
		System.out.println("Hello, World :) ");
	}
}

/*** Main Class***/

class PrintStringTest
{
	public static void main(String args[])
	{
		
		PrintString p = new PrintString(); // Creating Object of class PrintString
		p.displayText();		 // Calling non static method displayText()
		
	} 
}