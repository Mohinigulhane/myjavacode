package mkt_assignment;

//Write a program to check if gender equals to male or female.
//If it is male and check if age is greater than 18 or not.
//if it is greater than 18 then the person is eligible to vote 
//otherwise not eligible to vote.If it is female and check if age is greater than 18 or not.
//If the age is greater than 18 then the person is eligible to vote otherwise not eligible to vote 
public class assignment16 {

	public static void main(String[] args) {
		int Age = 19;
		char gender = 'F';
		if (Age > 18 )
		{
			
		    if (Age > 18 || gender == 'M') 
		     {
			   System.out.println("I am eligible for vote");
		     } 
		    else 
		     {
			   System.out.println("I am not eligible for vote");
		     }
			
		}
		else
		{
			System.out.println("000000000000000000000");
		}
	}

}
