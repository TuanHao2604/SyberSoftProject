import java.util.Scanner;

public class Tinhchusobangdequy {

	public static int Tinh(int n) {
		if(n%10==0)
			return 0;
		else 
			return 1+Tinh(n/10);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập n>=1 ");
			n=Integer.parseInt(scan.nextLine());
		}while(n<1);
		System.out.println("Amout of number characters "+Tinh(n));

	}

}
