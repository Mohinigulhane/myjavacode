package mkt_assignment;

public class For_loop_never_stops {

	public static void main(String[] args)
	{
		for(int i=-10; i<0; i++)
		//for(int i=0; i<=1; i--)//o/p is loop never ends (0<=1 condition is T so 0-1=-1
			                                           //(
		//for(int i=0; i<=-1; i++)//o/p is nothing bcz condition is false- (0<=-1 then false)
		{
			System.out.println(i);
		}

	}

}
