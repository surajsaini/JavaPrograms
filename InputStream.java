package JavaProgramListPackage;

import java.util.Scanner;

public class InputStream {

	public static void main(String[] args) {
		
		
		
		 Scanner scanner = new Scanner(System.in);

	        // Example: Reading a string
	        System.out.print("Enter first number ");
	        int firstnum = scanner.nextInt();

	        // Example: Reading an integer
	        System.out.print("Enter second number ");
	        int secondnum = scanner.nextInt();
        
	      int sum = firstnum - secondnum;

	        
	        System.out.println("Addition of both number is " + "--" + sum);
	        
	}

}
