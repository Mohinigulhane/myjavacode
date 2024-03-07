package mkt_assignment;
//assignment18-Write a program with 4 Static method and 4 Non-Static method make sure all have same name
public class Assignment17
{
	Assignment17()
	{
		System.out.println("This is constructor");
	}
	static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void substract()
	{
		int a=1000;
		int b=999;
		System.out.println(a-b);
	}
	void mul()
	{
		int a=99;
		int b=999;
		System.out.println(a*b);
	}
	void mod()
	{
		int a1=8;
		int b1=2;
		System.out.println(a1/b1);
	}
	public static void main(String[] args) 
	{
		add();
		substract();
		//new Assignment17();
		Assignment17 A1 =new Assignment17();
		A1.mul();		
		A1.mod();
		
	}

}
