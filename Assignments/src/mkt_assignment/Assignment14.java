package mkt_assignment;
//assignment14-Write a program for NOT with AND and NOT with OR operator

public class Assignment14 {

	public static void main(String[] args) 
	{
	int age=20;
	int salary=20000;
	if(!(age>25 && salary<10000)) //(!(F && F) //(!F) //(T)
	 {
		System.out.println("Condition is true if block is execute");
	 }
	   /* if(!(age>10 || salary<2000))
	      {
		    System.out.println("Be ready");
	      }
	     else
	      {
		    System.out.println("Not ready");
	      } */
	    else
	{
		System.out.println("Condition is false else block is execute");
	}
	}

}
