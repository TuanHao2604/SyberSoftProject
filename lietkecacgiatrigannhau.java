import java.util.Scanner;

public class lietkecacgiatrigannhau {
	
	
	public static int[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2) ");
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
	
	public static int khoangCachGanNhauNhat(int a[]) {
		int khoangCachGanNhauNhat=Math.abs(a[1]-a[2]);
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				int temp=Math.abs(a[i]-a[j]);
				if(temp<khoangCachGanNhauNhat)
					khoangCachGanNhauNhat=temp;
			}
		}
		return khoangCachGanNhauNhat;
	}
	
	public static void lietKeGiaTriGanNhau(int a[]) {
		int temp=khoangCachGanNhauNhat(a);
		System.out.println("Các giá trị có khoảng cách gần nhau nhất: ");
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				int temp2=Math.abs(a[i]-a[j]);
				if(temp2==temp)
					System.out.print("("+a[i]+","+a[j]+")"+"\t");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[]=Taomang(scan);
		XuatMang(a);
		lietKeGiaTriGanNhau(a);

	}

}
