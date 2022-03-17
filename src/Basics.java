
public class Basics {
	
	public static void main(String[] args)
	{
		
   // check palindrom number
		// do reveses and then  check the origi number with reverse number
		
		int rev  = 0 ;
		
		int num =16461 ;
		int o = num;
		while(num!=0 )
		{
			
			rev = rev*10 + num%10 ;
			num  = num/10 ;
		}
		
		System.out.println("reverse Num is" + rev);
		System.out.println("reverse" );
		
		if(o==rev)
		{ 
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a palindorm");
			
		}

}
	
}
