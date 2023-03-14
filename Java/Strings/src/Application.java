
public class Application {
	/*
	Strings, which are widely used in Java programming, are a sequence of characters. 
	In the Java programming language, strings are objects.
	The Java platform provides the String class to create and manipulate strings.
	
	*/
	
	
	public static void main(String[] args) {
		String text = "Hello";
		String name = "Avishkar";
		String blank = " ";
		String greetings = text + blank + name;
		int myInt = 12;
		double myDouble = 9.789;
		System.out.println(greetings);
		
		System.out.println(text + " " + name);
		
		System.out.println("Hello" + " " + "Avishkar");
		
		System.out.println("My roll no is : " + myInt+".");
		System.out.println("My CGPA is : " + myDouble + ".");
		
		/*As with any other object, you can create String objects 
		by using the new keyword and a constructor. The String class has thirteen constructors 
		that allow you to provide the initial value 
		of the string using different sources, such as an array of characters:*/
		
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		//The last line of this code snippet displays hello.
		
	}
}
