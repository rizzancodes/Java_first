

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(2));
		
	
		

	}
	
	static int factorial(int input)
	{
		if(input == 1 || input == 0) 
		{
			return 1;
		}
		
		
		else {
			
			return input * factorial(input-1);
			
			
		}
		
	}

}
