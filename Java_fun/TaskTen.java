import java.util.Scanner;
	public class TaskOne{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		int average = 0;
		
		while (count <= 10){
			System.out.print("Enter a score: ");
			int score = input.nextInt();
		if (score > 0 && score < 100){
			sum = sum + score;
			
	    count++;
	    	average = sum \ 10;
	 	}
		}
		System.out.println("Average: " + average);
		  
		}
	}
