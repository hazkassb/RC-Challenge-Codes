package myRCApplicationProject;

public class CracklePop {
	
	public static void main(String[] args) {
//		Data fields
		final int MAX = 100;
		final int INIT = 1;
		
		
//		print numbers 1 to 100; if number is divisible by 3, then print Crackle;
//		if number is divisible by 5, print Pop; if number is divisible by 3 and by 5,
//		then print CracklePop
		
		for(int i = INIT; i <= MAX; i++) {
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println("CracklePop");
			else if (i % 3 == 0)
				System.out.println("Crackle");
			else if (i % 5 == 0)
				System.out.println("Pop");
			else
				System.out.println(i);
		}
	}

}
