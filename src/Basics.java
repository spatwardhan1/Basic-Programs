
public class Basics {
	
	public static void main(String[] args)
	{
		// count the numbers
		// untill num>0 divide each number 
    int num = 12345 ;
    int even_count  = 0 ;
    int odd_count  = 0 ;
    
    while(num>0)
    {   int rem = num%10 ;
    
      if(rem%2==0)
    	  even_count++ ;
      else
    	  odd_count++ ;
    	num =num/10 ;
    	
    }
    
    System.out.println("Return even count" +even_count);
    System.out.println("return odd count" +odd_count);
		
}
	
}
