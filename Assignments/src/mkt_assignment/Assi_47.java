package mkt_assignment;
//In  a string "mango123" check which character is numeric and which is alpha
public class Assi_47 
{

	public static void main(String[] args)
	{
        String name="mango123";
        char[] c1= name.toCharArray();
       for(int i=0; i<name.length(); i++)
       {
    	 boolean answer=  Character.isAlphabetic(c1[i]);
    	 if(answer==true)
    	 {
    		 System.out.println("Index position " + i + " is " + " Alphabet" );
         }
    	 else 
    	 {
    		 System.out.println("Index position " + i + " is " + " Numeric" );}
    	 }
        
	}

}
