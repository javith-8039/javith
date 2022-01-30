package basic;

import java.util.Scanner;

public class area {
public static void main(String[] args)
{
	Scanner area=new Scanner (System.in);
	System.out.println("enter the radius...");
	double radius=area.nextDouble();
	double areas=Math.PI*(radius*radius);
	System.out.println("the area of rectangle..."+areas);
	System.out.println("enter the circumtance..");
	double circumtance=area.nextDouble();
	double radio=Math.PI*2*circumtance;
	
	
}
}
