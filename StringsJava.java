
public class StringsJava {
	
	public static void main(String[] args) {
		
		String s1 = " Rahul Shetty Academy";  //String is an object.
		String s2 = " hello";
		
		String s3 = new String("Rahul Shetty Academy");
		String s4 = new String ("hello");
		
		String s = "Rahul Shetty Academy";
		
		for(int i= 0 ; i<s.length();i++)   // printing each characters of the string
		{
			System.out.print(s.charAt(i));
			
		}
		System.out.println();
		
		System.out.println("-------------------");
		
		
		for(int i =s.length() -1; i>=0 ; i--) // reverse string 
		{
			System.out.print(s.charAt(i)); 
		}
		
		
		
	}

}
