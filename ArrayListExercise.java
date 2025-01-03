import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Shobha");
		a.add("Ratheesh");
		a.add("Diya");
		a.add("Nidhi");
		
		System.out.println(a.get(2)); //get method to get the index in arraylist
		System.out.println(a.get(3));
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		
		System.out.println("---------------------");
		
		for(int i =0; i<a.size();i++)   //using for Loop
		{
			
			System.out.println(a.get(i));
		}
		
		System.out.println("*************************");
		
		for(String element:a)             //using for each loop or enhanced for loop
		{
			System.out.println(element);
		}
	   
		//check whether element is present in the list
		System.out.println(a.contains("Nidhi"));
		System.out.println(a.contains("Rathi"));
		
		
		 String[]  name = {"shobha" , "ratheesh"};
		 
		System.out.println(name.equals("Shobha"));
		
       List<String> nameArrayList = Arrays.asList(name);
       nameArrayList.contains("ratheesh");
	}

}
