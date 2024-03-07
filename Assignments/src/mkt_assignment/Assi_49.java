package mkt_assignment;

public class Assi_49 {

	public static void main(String[] args) 
	{
		String name="sky is 441 @#$";
		char []c1=name.toCharArray();
		int count_alpha=0;
		int count_numeric=0;
		int count_space=0;
		for(int i=0; i<name.length(); i++)
		{
			boolean answer= Character.isAlphabetic(c1[i]);
			boolean answer1= Character.isDigit(c1[i]);
			boolean answer2=  	Character.isSpaceChar(c1[i]);
			Character.isSpaceChar(c1[i]);
			if(answer==true)
			{
				count_alpha++;
			}
			if(answer1==true)
			{
				 count_space++;
			}
			if(answer2==true)
			{
				count_numeric++;
			}
		}
	System.out.println("count of alpha" +  count_alpha);
	System.out.println("count of digit" + count_numeric);
	System.out.println("count of sapce" + count_space);
	System.out.println("count of special character" + "");
	int count_of_specialchar=name.length()-(count_alpha+count_numeric+count_space);
	System.out.println(count_of_specialchar);
	}
}








