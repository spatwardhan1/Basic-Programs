
public class Basics {
	
	public static void main(String[] args)
	{
		
		int a = 1234 ;
		
		StringBuilder s = new StringBuilder();
		// append will add the variable inside string builder
		s.append(a);
		StringBuilder rev = s.reverse();
		
		System.out.println("revverse integer" +rev);
	}

}
