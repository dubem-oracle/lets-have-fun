import java.util.Scanner;
	public class TaskFour{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 1;
	
		while (count <= 10){
			System.out.print("Enter a score: ");
			int score = input.nextInt();
			
		if (count % 2 == 0){
	
		sum += score;
		}
	  count++;
		}
		
		System.out.println("Sum: " + sum);
		
		
		}
	}
	
	
	
		  
			
