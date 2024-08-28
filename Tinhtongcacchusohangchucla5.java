import java.util.Scanner;

public class Tinhtongcacchusohangchucla5 {

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
	
	public static Boolean Chechchuc(int k) {
		if((k/10)%10==5)
			return true;
		return  false;
	}
	
	public static int TongChuSo(int t) {
		int sum=0;
		while(t>0) {
			sum+=t%10;
			t/=10;
		}
		return sum;
	}
	public static void TinhTong(int a[]) {
		int TongCacSo=0;
		int TongChuSo=0;
		for(int i=0;i<a.length;i++) {
			if(Chechchuc(a[i])) {
				TongCacSo+=a[i];
				TongChuSo+=TongChuSo(a[i]);
			}
		}
		System.out.println("Tổng các số có hàng chục là 5: Tổng các số= "+TongCacSo);
		System.out.println("Tổng các chữ số có hàng chục là 5: Tổng các chữ số= "+TongChuSo);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=Taomang(scan);
		XuatMang(a);
		TinhTong(a);
	}
}


