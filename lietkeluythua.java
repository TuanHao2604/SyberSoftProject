package lietkecacsoluythuacua3;

import java.util.Scanner;

public class lietkeluythua {
	final static int LuyThua = 3;
	public static int[] NhapMang(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào số phần tử ");
			n =  Integer.parseInt(scan.nextLine());
		} while (n < 0);
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nhập a[" + i + "]");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static Boolean CheckLuyThua(int k) {
		while(k%LuyThua==0) {
			k/=LuyThua;
			if(k==1)
				return true;
		}
		return false;
	}
	
	public static void InLuyThua(int a[]) {
		Boolean flag = true;
		for(int i =0;i<a.length;i++) {
			if(CheckLuyThua(a[i])) {
				System.out.print(a[i]+"\t");
				flag=false;
			}
		}
		if(flag) {
			System.out.println("Không có giá trị thỏa điều kiện ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a=NhapMang(scan);
		InLuyThua(a);
	}

}
