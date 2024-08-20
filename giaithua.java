package tinggiaithua;

import java.util.Scanner;

public class giaithua {

	public static long giaithua(int n) {
		if(n==0)
			return 1;
		return n*giaithua(n-1);
	}

	public static void Nhap(Scanner scan) {
		System.out.println("vui lòng nhập số n vào: ");
		int n = scan.nextInt();
		System.out.println("Giai thừa "+n+"!"+" là: "+giaithua(n));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Nhap(scan);
	}

}
