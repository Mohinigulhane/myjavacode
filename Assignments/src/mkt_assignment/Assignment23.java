package mkt_assignment;
//Assignment23-Write a program for Declaration and Intilization for Local and Global Variables
public class Assignment23 
 {
	    static int age;  //static variable declare-global
	    static double salary; //static variable declare-global
	    char gender='M';  //non-static variable declare & initialized
	    void add()
	    {
	    	
	    }
	    static void subtract() 
	    {
	    	System.out.println();
	    }
		public static void main(String[] args)
		{
			System.out.println(age);
			System.out.println(salary);
			Assignment23 G1=new Assignment23();
			System.out.println(G1.gender);
		}
 }
		


/*{
	static void add()
    {
		int a=100;
		int a1=200;
		System.out.println(a+a1);//local variable declare & initialize
		}
	void subtract()
	{
		int a=100;
		int a1=200;
		System.out.println(a-a1);
	}
	public static void main(String[] args) 
	{
		add();
		Assignment23 a1 = new Assignment23();
		a1.subtract();
	}
	*/


