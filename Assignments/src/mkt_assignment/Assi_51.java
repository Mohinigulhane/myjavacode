package mkt_assignment;
//check if the given string contains space
public class Assi_51 
{
 public static void main(String[] args)
 {
		String name="mohini gulhane";
		char[] c1= name.toCharArray();
		for(int i=0; i<name.length(); i++)
		{
			boolean answer= Character.isSpaceChar(c1[i]);
					if(answer==true)
					{
						System.out.println("There is space between given string" + " index of space is " + i);
					}
		}
		}

}
