
public class Basics {
	
	public static void main(String[] args)
	{
		// count the numbers
		// create sum
		// sum + each number num%10
     int num = 12345 ;
     int sum = 0 ;
     
     while(num > 0)
     {
    	 
    	 sum = sum + num%10 ;
    	 num = num/10 ;
    	
    }
    
    System.out.println("Return sum" +sum);
    //System.out.println("return odd count" +odd_count);
		
}
	
}
