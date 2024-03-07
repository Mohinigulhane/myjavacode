package mkt_assignment;
//Check any 2 strings are anagram or not
import java.util.Arrays;

public class Assi_46 {

	public static void main(String[] args) 
	{
		String name1="cat";
		String name2="tac";
		if(name1.length()!= name2.length())
		{
			System.out.println("Sorry the given two strings are not anagram ");
		}
		else
	      {
	    	  char n1[]=   name1.toCharArray();
	    	  char n2[]=   name2.toCharArray(); 
	    	  System.out.println(Arrays.toString(n2));
	          System.out.println(Arrays.toString(n1));
	          Arrays.sort(n2);
	          Arrays.sort(n1);
	       boolean answer=   Arrays.equals(n1,n2);
	       if (answer==true)
	       {
	    	   System.out.println("The given two strings are anageram to each other");
	       }
	       else
	       {
	    	  System.out.println("The given two strings are not anageram to each other"); 
	       }
	      }
		}
	}

