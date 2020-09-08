import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first num");
		double a =scan.nextDouble();
		System.out.println("enter second num");
		double b= scan.nextDouble();
		double result=0;
		System.out.println("select operation 1. addition 2. subtraction 3.mltiplication 4.division" );
		String typeOfOperation = scan.next();
		switch(typeOfOperation) {
		case "addition":result =a+b;
			 			break;
		case "subtraction":result =a-b;
							break;
		case"multiplication":result= a*b;
							break;
		case "division" :result = a/b;
						break;
		default: System.out.println("operator not found");
		
		
		
		}
		System.out.println(result);
		

	}

}
