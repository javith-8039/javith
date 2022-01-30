package basic;

import java.util.Scanner;

public class reversenum {
	public static void main(String[] args) {
		int num=0,revnumber=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		while(num!=0)
		{
			revnumber=revnumber*10;
			revnumber=revnumber+num%10;
			num=num/10;
		}
		System.out.println("the reverse of given number.."+revnumber);
	}

}
