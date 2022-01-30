package basic;

import java.util.Scanner;

public class evenodd {
public static void main(String[] args) {
	System.out.println("enter the number...");
	int num;
	Scanner scan=new Scanner(System.in);
	 num=scan.nextInt();
		if(num%2==0)
			System.out.println("the given num is even");
			else
				System.out.println("the given num is odd");		
}
}
