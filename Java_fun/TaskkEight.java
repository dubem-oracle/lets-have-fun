import java.util.Scanner;
	public class TaskEight{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		
		while (count <= 10){
			System.out.print("Enter a score between 0 and 100: ");
			int score = input.nextInt();
		if (score > 0 && score < 100){
			
			sum = sum + score;
	    count++;
	    }
	  else{
	    System.out.println("INVALID SCORE");
	  }
		}
		System.out.println("Sum: " + sum);
		  
		}
	}
