package tongcacsole;

import java.util.Scanner;

public class tongcacsole {

	public static int tongcacsole(int n) {
		int Sum=0;
		for(int i=1;i<=n;i+=2) {
			Sum+=i;
		}
		return Sum;
	}
	
	public static void Nhap(Scanner scan) {
		System.out.println("Nhập số nguyên dương lớn hơn 0 ");
		int n=scan.nextInt();
		if(n<0) {
			System.out.println("Vui lòng nhập lại");
			Nhap(scan);
		}
		else
			System.out.println("Tông các số lẻ bé hơn "+n+" là: "+tongcacsole(n));
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); 
		Nhap(scan);

	}

}
