import java.util.Scanner;

public class Tinhtong7 {

	public static double Sum(int n) {
		if(n==1)
			return 1;
		else 
			return Math.sqrt(n+Sum(n-1));
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
