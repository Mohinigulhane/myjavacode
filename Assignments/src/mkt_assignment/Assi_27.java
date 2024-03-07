package mkt_assignment;
import java.util.Scanner;
//Assi27-create 5 methods for addition , subtraction , multiplication ,divison , modulus 
//using scanner class with global variable
public class Assi_27 
{
	static int a;
	static int b;
	static void add(int a, int b)
	{
		int add=a+b;
		System.out.println(add);
	}
	static void sub(int a,int b)
	{
	   int sub=a-b;
	   System.out.println(sub);
	}
	static void multi(int a, int b)
	{
		int multi=a*b;
		System.out.println(multi);
	}
	static void div(int a, int b)
	{
		int div=a/b;
		System.out.println(div);
	}
	static void mod(int a , int b)
	{
		int mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the valu of a & b");
		int a=s1.nextInt();
		int b=s1.nextInt();
		add(a,b);
		sub(a,b);
		multi(a,b);
		div(a,b);
		mod(a,b);
		
		
	}
}
