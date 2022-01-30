package basic;

public class nestedloop {
	public static void main(String[] args) {
		int tech=2;
		int course=2;
		switch(tech)
		{
		case 1:{
			System.out.println("java");
			break;
		}
		case 2:{
			switch(course)
			{
			case 1:
			{
				System.out.println("c");
			break;
			}
			case 2:{
				System.out.println("java advance");
			}
			}
		}
		}
	}

}
