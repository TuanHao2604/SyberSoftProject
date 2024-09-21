import java.util.Scanner;

public class Tinhtong5 {

	public static int Sum1(int n) {
		if(n==1)
			return 1;
		else 
			return n +Sum1(n-1);
	}
	public static float Sum(int n) {
		if(n==1)
			return 1;
		else
			return 1.0f/Sum1(n)+Sum(n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập n>=1 ");
			n=Integer.parseInt(scan.nextLine());
		}while(n<1);
		System.out.println("Sum of fractons "+Sum(n));
	}


}
