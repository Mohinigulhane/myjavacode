package mkt_assignment;

import java.util.Arrays;

// assignment43-Create an array with double and Boolean data types?
public class Assi_43 {

	public static void main(String[] args) 
	{
		int a=1;
	boolean b =(a==0);
	System.out.println(b);
	
	double salary[]= new double[4];
         salary[0]= 80000;
		 salary[1]= 40000;
		 salary[2]= 85000;
		 salary[3]= 65000;
		 Arrays.sort(salary);
		System.out.println(Arrays.toString(salary));
		}

}
