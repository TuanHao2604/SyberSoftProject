import java.util.Scanner;

public class Tinhtong6 {

	public static double Sum(int n) {
		if(n==1)
			return 1.0f/2;
		else 
			return (double)n/(n+1) +Sum(n-1);
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
