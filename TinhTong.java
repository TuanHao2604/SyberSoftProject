import java.util.Scanner;

public class TinhTong {

	public static float Sum(int n) {
		if(n==1)
			return 1;
		else 
			return (float)1/n +Sum(n-1);
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
