package basic;

import java.util.Scanner;

public class whileloop {
public static void main(String[] args) {
	int number,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number below 10..");
	number=sc.nextInt();
	
	while(number<=10);
	{
		sum=sum+number;
		number++;
	}
	System.out.format("sum of the numbers in loop is : %d",sum);
}
}
