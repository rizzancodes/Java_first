
public class VarAgrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TEST");
		
		System.out.println(howAboutVarArgs(100,50,150));

	}
	
	public static int sumEm(int x,int y) {
		return x+y;
	}
	
	
	public static int sumEm(int x,int y, int z) {
		return x+y+z;
	}
	
	public static int howAboutVarArgs( int ...arr) 
	{
		int sum = 0;
		int counter =0;
		System.out.println(counter);
		for (int x: arr)
		{
			sum += x;
			counter++;
			System.out.println(counter);
			
			
		}
		return sum/counter;
		
		
		
	}
	
	
	
	

}
