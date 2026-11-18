import java.util.Scanner;
	public class TaskFive{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 1;
	
		while (count <= 10){
			System.out.print("Enter a score: ");
			int score = input.nextInt();
			
		if (score % 2 == 0){
	
		sum += score;
		}
	  count++;
		}
		count++;
		System.out.println("Sum: " + sum);
		
	
		}
	}
	
	
	
		  
			
