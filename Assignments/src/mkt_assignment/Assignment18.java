package mkt_assignment;
//Assignment18- Write a program with 4 Static method and 4 Non-Static method
  //make sure all have same name
public class Assignment18
{
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a, int b)
	{
		System.out.println("2");
	}
	static void add(int b, char g )
	{
		System.out.println("3");
	}
	static void add(float r, int y)
	{
		System.out.println("4");
	}
	 void add(String s, char d)
	{
		System.out.println("5");
	}
    void add(double d)
    {
		System.out.println("6");	
    }
    void add(String r)
    {
		System.out.println("7");	
    }
    void add(char t)
    {
		System.out.println("8");	
    }
		
	public static void main(String[] args)
	{
		add();
		add(100,200);	
		add(100,'e');
		add(1.2f, 400);
	Assignment18 a1=new Assignment18();
	a1.add("Gulhane",'M');
	a1.add(99.76);
	a1.add("Mohini");
	a1.add('G');
	}
}
