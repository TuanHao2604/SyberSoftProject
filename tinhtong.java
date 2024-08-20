import java.util.Scanner;

public class tinhtong {

	public static long tinhtongdequy(int x , int n) {
		if(n==1)
			return x;
		return ( long) (Math.pow(x, n)+tinhtong(x,n-1));
	}
	
	public static long tinhtongkodequy(int x, int n) {
		long  Sum=0;
		for(int i = 1;i<=n;i++) {
			Sum+=Math.pow(x, i);
		}
		return Sum;
	}
	public static void Nhap(Scanner scan) {
		System.out.println("Vui long nhập số n vào ");
		int n = scan.nextInt();
		System.out.println("Vui long nhập số x vào ");
		int x = scan.nextInt();
		System.out.println("Tổng của n = "+n+" và x = "+x +" là:" +tinhtongkodequy(x, n) );
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Nhap(scan);
	}

}
