package basic;

import java.util.Scanner;

public class larnum {
public static void main(String[] args) {
	int n1;
	System.out.println("enter the first num..");
	Scanner scan=new Scanner(System.in);
	n1=scan.nextInt();
    System.out.println("enter the second num..");		
	int n2=scan.nextInt();
	System.out.println("enter the third num..");
	int n3=scan.nextInt();
	
	if (n1>=n2 &&n1>=n3)
		System.out.println(n1+"is the largest num");
	else if (n2>=n1 &&n2>=n3)
		System.out.println(n2+"is the largest num");
	else
		System.out.println(n3+"is the largest num");
}
}
