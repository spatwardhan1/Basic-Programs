
public class Basics {
	
	public static void main(String[] args)
	{
		
   // reverse a string using array 
		
		// Convert string to Char Array
		// loop from the end
		String rev  = " " ;
		String str = "abcd";
		char a[]  = str.toCharArray();
		for(int i = str.length()-1;i>=0 ;i--)
		{
			 rev = rev + a[i];
		}
		
		System.out.println(" The revers of the given String is");
		
		System.out.println(rev);
}
	
}
