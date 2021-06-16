import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int aValue;
		aValue = 0;
		//aValue = 42;
		
		System.out.println(aValue);
		
		while(aValue != 51) {
			System.out.println(aValue);
			aValue++;
		}
		
		System.out.println("==============");
		System.out.println("Table: \n");
		System.out.println("Enter number to calulate table: ");
		
		int user_in = input.nextInt();
		//System.out.println(user_in);
		
		for(int i=1;i<13;i++) {
			System.out.println(user_in+ " x "+ i + " = " + i*user_in);
			
			
			
		}
		
		
		
		
		
		
		

	}
	
	
}