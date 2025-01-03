
public class JavaExercise {
	
public static void main (String[] args) {
        
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        
        System.out.println("Length of the numbers : " +numbers.length);
        
        for(int i =0 ; i < numbers.length ; i++)
        {
            System.out.println(numbers[i]);
        }
        
        System.out.println(" ------------------------ ");
        
        
        for(int i =numbers.length -1 ; i >=0 ;i--)
        {
        	System.out.println(i);
        }
    }


}
