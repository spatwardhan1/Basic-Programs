
public class Basics {
	
	public static void main(String[] args)
	{
		
	 int rev  = 0 ;
	 
	 int num  = 1234 ;
	 while(num!=0)
	 {
		 rev = rev*10 + num%10 ; // this will reverse number each time 
		 num  = num/10 ;  // this will reduce each number by 1
	 }
	 
	 System.out.println(" reverse number is " + rev);
	}

}
