package mkt_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assi_45 {

	public static void main(String[] args) 
	{
	
		int s[]=new int [4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of array");
		for(int i=0; i<s.length; i++)
		{
			s[i]=	s1.nextInt();
			
		}
		//Arrays.sort(s);
		//System.out.println(Arrays.toString(s));
		System.out.println("Array elements");
		for(int i=0; i<s.length; i++)
		{
		  System.out.println(s[i]+" ");
		}
		
		System.out.println("array Length "+ s.length);
		
}

}
