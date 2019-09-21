package duling_p3;
import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = new String[5];
		int[][] responses = new int[5][10];
		
		topics[0] = "Art";
		topics[1] = "Games";
		topics[2] = "Nature";
		topics[3] = "Food";
		topics[4] = "Books";
		
		int i;
		int j;
		
		int people;
		int rating;
		int[] average = new int[5];
		
		String mostImportant = "";
		String leastImportant = "";
		int mostPoints = 0;
		int leastPoints = 0;
		
		
		System.out.print("Please enter number of people rating: ");
		people = scnr.nextInt();

		for (i = 0; i < people; ++i) {
			System.out.println("Please enter a rating from 1 (least important) to 10 (most important) for each topic.");
			for(j = 0; j < topics.length; ++j) {
				System.out.print("Enter rating for " + topics[j] + " : ");
				rating = scnr.nextInt();
				
				responses[j][rating - 1]++;
			}
		}
		
		
		for (i = 0; i < responses.length; ++i) {
			average[i] = 0;
			for (j = 0; j < responses[i].length; ++j) {
				average[i] = average[i] + (responses[i][j] * (j + 1));
			}
			
			if (i == 0) {
				mostPoints = average[i];
				mostImportant = topics[i];
				leastPoints = average[i];
				leastImportant = topics[i];
			}
			else {
				if (average[i] > mostPoints) {
					mostPoints = average[i];
					mostImportant = topics[i];
				}
				if (average[i] < leastPoints) {
					leastPoints = average[i];
					leastImportant = topics[i];
				}
			}
			
			average[i] = average[i] / people;
		}
		
		
		System.out.println("");
		System.out.print("                    ");
		
		for (i = 0; i < 10; ++i) {
			System.out.print((i + 1) + "         ");
		}
		
		System.out.print("            Average");
		System.out.println("");
		
		for (i = 0; i < responses.length; i++) {
			System.out.println("");
			System.out.printf("%-20s", topics[i]);
			for(j = 0; j < responses[i].length; ++j) {
				System.out.printf("%-10d", responses[i][j]);
			}
			System.out.printf("%20d", average[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Most points: " + mostPoints + "    Topic: " + mostImportant);
		System.out.println("Least points: " + leastPoints + "    Topic: " + leastImportant);

	}

}
