import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//take user input: char
		System.out.println("Enter a Character:");
		char ch  = input.nextLine().charAt(0);
		//print user entered char 
		System.out.println("You entered: "+ ch);
		
		//take user input: String
		System.out.println("Enter a string:");
		String line = input.nextLine();
		//print user entered string 
		System.out.println("You entered: "+ line);
		
		//take user input: Integer
		System.out.println("Enter a Integer:");
		int x  = input.nextInt();
		//print user entered integer 
		System.out.println("You entered: "+ x);
		
		//take user input: Float
		System.out.println("Enter a Float:");
		float y  = input.nextFloat();
		//print user entered Float 
		System.out.println("You entered: "+ y);
		
		//take user input: Double
		System.out.println("Enter a Double:");
		double z  = input.nextDouble();
		//print user entered Double 
		System.out.println("You entered: "+ z);
		
		
		
		
	}

}
