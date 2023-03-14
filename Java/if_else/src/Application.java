
public class Application {

	public static void main(String[] args) {
	/*  Java has the following conditional statements:
		Use if to specify a block of code to be executed, if a specified condition is true
		Use else to specify a block of code to be executed, if the same condition is false
		Use else if to specify a new condition to test, if the first condition is false
		Use switch to specify many alternative blocks of code to be executed */
		int number = 5;
		while(number!=10) {		
			if(number == 5) {
				System.out.println("number = 5  Printed!!");
			}else if(number == 6){
				System.out.println("number = 6  Printed!!");
			}else if(number == 7) {
				System.out.println("number = 7  Printed!!");
			}else {
				System.out.println("breaking the loop!!!");
				break;
			}
			number++;
		}
	}

}
