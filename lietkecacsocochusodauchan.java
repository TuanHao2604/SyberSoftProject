package lietkecacsocochusodauchan;

import java.util.Scanner;

public class lietkecacsocochusodauchan {

	public static int[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>=2) ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2);
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhập a["+i+"]");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void XuatMang(int a[]) {
		System.out.println("Danh sách phần tử trong mảng ");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	} 
	
	public static Boolean CheckChuSoDauTienChan(int k) {
		int temp = k;
		int next = k/10;
		while(temp>0) {
			if(next==0) {
				if(temp%2==0)
					return true;
			}
			temp=next;
			next/=10;
		}
		return false;
	}
	
	public static void Lietkecacsocochusodauchan(int a[]) {
		System.out.println("Danh sách các giá trị có số đầu chẵn");
		for(int i =0;i<a.length;i++){
			 if(CheckChuSoDauTienChan(a[i]))
				 System.out.print(a[i]+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[]=Taomang(scan);
		XuatMang(a);
		Lietkecacsocochusodauchan(a);
	}

}
