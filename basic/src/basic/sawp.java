package basic;

public class sawp {
  public static void main(String[] args) {
	  float first=11.5f,second=15.22f;
	System.out.println("__before swap__");
	System.out.println("first number..."+first);
	System.out.println("second number..."+second);
	float tempory=first;
    first=second;
    second=tempory;
	System.out.println("after swap..");
	System.out.println("first number..."+first);
	System.out.println("second number.."+second);
}

}
