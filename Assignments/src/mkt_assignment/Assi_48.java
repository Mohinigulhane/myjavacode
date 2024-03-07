package mkt_assignment;

public class Assi_48 {

	public static void main(String[] args)
	{
		String name="mango";
        char[] c1= name.toCharArray();
        int alphaCount=0;
        int numericCount=0;
       for(int i=0; i<=name.length()-1; i++)
       {
    	 boolean answer=  Character.isAlphabetic(c1[i]);
    	 
    	 if(answer==true)
    	 {
    		 alphaCount++;
         }
    	 else 
    	 {
    		 numericCount++;
         }
       }
    	 System.out.println("Alpha count is " + alphaCount++ );
    	 System.out.println("Numeric count is " + numericCount++ );
}
	}




