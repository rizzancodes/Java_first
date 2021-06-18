
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		pattern(5);

	}
	
	static void pattern(int n)
	{
		for(int i=0; i<n;i++) {
			
			for(int j=0; j<i+1;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}

}
