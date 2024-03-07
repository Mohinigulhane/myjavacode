package mkt_assignment;
//Assignment19-write a program for constructor overloading using 10 constructors
public class Assignment19
{
	Assignment19()
	{
		System.out.println("1");
	}
	Assignment19(int a)
	{
		System.out.println("2");
	}
	Assignment19(char c)
	{
		System.out.println("3");
	}
	Assignment19(float f)
	{
		System.out.println("4");
	}
	Assignment19(int a, float f)
	{
		System.out.println("5");
	}
	Assignment19(double r, int u)
	{
		System.out.println("6");
	}
	Assignment19(String t)
	{
		System.out.println("7");
	}
	Assignment19(char g, int f)
	{
		System.out.println("8");
	}
	Assignment19(float f,char t)
	{
		System.out.println("9");
	}
	Assignment19(String h,float f)
	{
		System.out.println("10");
	}	
public static void main(String[] args) 
	{
	new Assignment19();	
	new Assignment19(100);
	new Assignment19('R');
	new Assignment19(88.99f);
	new Assignment19(22, 0.9f);
	new Assignment19(0.0, 33);
	new Assignment19("Mohini");
	new Assignment19('L', 44);
	new Assignment19(0.5f, 'I');
	new Assignment19("Gulhane",19.99f);  
	}

}
