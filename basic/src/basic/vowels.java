package basic;

import java.util.Scanner;

public class vowels {
public static void main(String[] args) {
	char ch;
	System.out.println("enter a letter..");
	Scanner scan=new Scanner(System.in);
	ch=scan.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		System.out.println(ch+ "is vowel");
	else
	    System.out.println(ch+ "is consonant");
}
}
