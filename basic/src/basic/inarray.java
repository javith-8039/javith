package basic;

import java.util.Scanner;

public class inarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] array=new int[10];
	int sum=0;
	System.out.println("enter the number..");
	for(int i=0;i<10;i++) {
		array[i]=sc.nextInt();
	}
	for(int num:array) {
		sum=sum+num;
	}
	System.out.println("the array for the given num is..."+sum);
}
}
