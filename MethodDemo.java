
public class MethodDemo {
	
	public static void main(String[] args)
	{
		
	   MethodDemo d = new MethodDemo();
	   
	   //d.getData();
	   //int num = d.getData();
	   System.out.println(d.getData());
	   
	   MethodDemo2 d1 = new MethodDemo2();
	   
	  // d1.getUserData();
	   
	  System.out.println(d1.getUserData());
	   	
		
	}
	
	public static int getData()
	{
		System.out.println("hello world");  
		
	    return 10;
	}
}
