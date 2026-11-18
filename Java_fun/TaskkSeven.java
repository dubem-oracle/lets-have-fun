import java.util.Scanner;
	public class TaskSeven{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 1;
	  int average = 0;
		int evencounter = 0;
		
		while (count <= 10){
			System.out.print("Enter a score: ");
			int score = input.nextInt();
			
		if (score % 2 == 0){
	  evencounter++;
		sum += score;
		 
		}
	  count++;
		}
		count++;
		average = sum / evencounter;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		
	
		}
	}
	
	
	
		  
			
