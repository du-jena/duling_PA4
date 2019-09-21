package duling_p1;
import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userData;
		
		System.out.println("Enter a number to decrypt: ");
		userData = scnr.nextInt();
		
		int num1 = userData / 1000;
		int num2 = (userData % 1000) / 100;
		int num3 = (userData % 100) / 10;
		int num4 = userData % 10;
		
		num1 = (num1 + 3) % 10;
		num2 = (num2 + 3) % 10;
		num3 = (num3 + 3) % 10;
		num4 = (num4 + 3) % 10;
		
		System.out.println("Decrypted number: ");
		System.out.println("" + num3 + num4 + num1 + num2);

	}

}
