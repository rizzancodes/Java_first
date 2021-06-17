import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("test");
		Scanner sc = new Scanner(System.in);
		//Random rand = new Random();		
		int computerScore =0;
		
		int userScore =0;
		int botMove; // = rand.nextInt((3+1) - 1) + 1;
		
		
		System.out.println("Game Convention: 1 is for Rock, 2 is for Paper, 3 is for Scissor.");
		
		char quitToggle = 'r';
		
		while(quitToggle != 'q' || quitToggle!='Q')
		{
			System.out.println("Enter your move: ");
			int userMove = sc.nextInt();
			
			if(userMove == 1) {
				botMove = getBotMove();
				System.out.println("Bot entered: "+botMove);
				if (botMove == 2)
				{
					computerScore++;
					System.out.println("Bot Won!");
					scores(userScore,computerScore);
					
				}
				else if(botMove == 3) {
					userScore++;
					System.out.println("You Won!");
					scores(userScore,computerScore);
					
					
				}
				else
				{
					System.out.println("Draw");
					scores(userScore,computerScore);	
					
				}}
				
				else if(userMove == 2) {
					botMove = getBotMove();
					System.out.println("Bot entered: "+botMove);
					if (botMove == 3)
					{
						computerScore++;
						System.out.println("Bot Won!");
						scores(userScore,computerScore);
						
					}
					else if(botMove == 1) {
						userScore++;
						System.out.println("You Won!");
						scores(userScore,computerScore);
						
						
					}
					else
					{
						System.out.println("Draw");
						scores(userScore,computerScore);	
						
					}}
					
					
					else if(userMove == 3) {
						botMove = getBotMove();
						System.out.println("Bot entered: "+botMove);
						if (botMove == 1)
						{
							computerScore++;
							System.out.println("Bot Won!");
							scores(userScore,computerScore);
							
						}
						else if(botMove == 2) {
							userScore++;
							System.out.println("You Won!");
							scores(userScore,computerScore);
							
							
						}
						else
						{
							System.out.println("Draw");
							scores(userScore,computerScore);	
							
						}}
						else {
							System.out.println("Wrong input! Do you want to quit?");
							quitToggle = sc.next().charAt(0);
							scores(userScore,computerScore);
							
							
							
						}
						
					
			
			System.out.println("Do you want to quit? Press q or Q: Enter anything to continue ");
			
			quitToggle = sc.next().charAt(0);
			scores(userScore,computerScore);
				
			}
			
				}
		


	
	public static int getBotMove() {
		Random rand = new Random();	
		int move = rand.nextInt((3+1) - 1) + 1;
		return move;
		
		
		
	}
	
	public static void scores(int yScore,int bScore) {
		
		System.out.println("Scores: ");
		System.out.println("Bot: "+bScore);
		System.out.println("You: "+yScore);
	//	System.out.println(tss);
		
		
		
	}
	
	

}
