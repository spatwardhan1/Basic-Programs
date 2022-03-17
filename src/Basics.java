
public class Basics {
	
	public static void main(String[] args)
	{
		
    // check palindrome string
		
		// reverse the string
		// check the reverse string with original string
		
		String str = "MADAM" ;
		String abc = "MADAM";
		String original = str ;
		String rev = "";
		
		
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println("reverse " +rev);
		System.out.println("Original" +original);
		System.out.println(original.equalsIgnoreCase(rev));
		// if getting false "" should not have space
		if(original.equalsIgnoreCase(rev))
		{
			System.out.println(" Palidrome in String");
		}
		
		else
		{
			System.out.println(" Not a palindrome");
		}
		
}
	
}
