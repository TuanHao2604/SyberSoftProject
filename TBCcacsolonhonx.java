package TBCcacsolonhonx;

import java.util.Scanner;

public class TBCcacsolonhonx {

	static final int Min = -1000;
	static final int Max = 1000;

	public static int[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>1) ");
			n = scan.nextInt();
		} while (n < 1);
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Min + (int) (Math.random() * (Max - Min) + 1);
		}
		return a;
	}
	public static void Sumlonhonx(int a[],Scanner scan) {
		int sum=0,count=0;
		System.out.println("Nhập giá trị x: ");
		int x=Integer.parseInt(scan.nextLine());
		for(int i:a) {
			if(i>x) {
				sum+=i;
				count++;
			}
		}
		float finalsum=(float)sum/count;
		System.out.println("Trung bình cộng các số lớn hơn "+ x +" là: "+finalsum);
	}
	public static void XuatMang(int a[]) {
		System.out.println("Danh sách phần tử trong mảng ");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	} 
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int a[]= Taomang(scan);
		int a[]= {551,758,419,833,611};
		XuatMang(a);
		Sumlonhonx(a, scan);

	}

}
