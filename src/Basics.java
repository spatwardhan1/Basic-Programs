
public class Basics {
	// prime number
	//get the count of numbers by num%i
	// if num%i ==2 then prime
	public static void main(String[] args)
	{
	  // prime no
		
		int num = 3 ;
		int count  =  0 ;
		
	if(num>1) {	for(int i=1;i<=num ;i++)
		{ if(num%i==0) {
			count++ ;
		}
		}
			
			if(count == 2)
			{
				System.out.println("This is Prime Number");
			}
			else
			{
		System.out.println("This is not Prime number");
			}
		
	
	}
  	
		
	}
}