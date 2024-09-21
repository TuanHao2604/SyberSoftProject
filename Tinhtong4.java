import java.util.Scanner;

public class Tinhtong4 {

	public static long  Sum(int n, int x) {
		if(n==1)
			return (long ) Math.pow(x, 1);
		else 
			return (long)Math.pow(x,n) +Sum(n-1,x);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập n>=1 ");
			n=Integer.parseInt(scan.nextLine());
		}while(n<1);
		System.out.println("Nhập vào x");
		int x=Integer.parseInt(scan.nextLine());
		System.out.println("Sum of fractons "+Sum(n,x));
	}
}
