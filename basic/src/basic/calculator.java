package basic;

import java.util.Scanner;

public class calculator {
 public static void main(String[] args) {
	System.out.println("enter the first number...");
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	System.out.println("enter the second number...");
	int num2=scan.nextInt();
	System.out.println("addition of two numbers..."+(num1+num2));
}
}