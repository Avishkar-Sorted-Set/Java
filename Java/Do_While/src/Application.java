import java.util.Scanner;

public class Application {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int value;
			do {
				System.out.println("Enter a number");
				value = sc .nextInt();
			}while(value!=5);
		
		System.out.println("Got 5!!!");
	}
}
