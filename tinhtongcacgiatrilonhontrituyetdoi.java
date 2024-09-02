package tinhtongcacgiatrilonhontrituyetdoi;

import java.util.Scanner;

public class tinhtongcacgiatrilonhontrituyetdoi {
	static final int Min = -1000;
	static final int Max = 1000;

	public static double[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>1) ");
			n = scan.nextInt();
		} while (n < 1);
		double a[] = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = Min + (double) (Math.random() * (Max - Min) + 1);
		}
		return a;
	}
	
	public static void XuatMang(double a[]) {
		System.out.println("Danh sách phần tử trong mảng ");
		for (double i : a) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	} 
	
	public static Boolean check(double temp, double next) {
		if(temp>Math.abs(next))
			return true;
		return false;
	}
	
	public static double sum(double a[]) {
		double sum=0;
		for(int i=0;i<a.length-1;i++) {
			if(check(a[i],a[i+1]))
				sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		 //double a[]=Taomang(scan);
		double a[]={527.4818,-755.9264,590.7367,-344.75305,190.6821,-67.82556,320.6443,215.90381,-244.73273,45.474243};
		XuatMang(a);
		System.out.println("Tổng các giá trị tuyệt đối của gía trị đứng sau liền kề là: ");
		System.out.println("Tổng = "+sum(a));

	}

}
