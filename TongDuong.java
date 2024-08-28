import java.util.Scanner;

public class TongDuong {

	static final int Min = -1000;
	static final int Max = 1000;

	public static float[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng ");
			n = scan.nextInt();
		} while (n<1);
		float a[] = new float[n];
		for (int i = 0; i < n; i++) {
			a[i] = Min + (float) (Math.random() * (Max - Min) + 1);
		}
		return a;
	}
	
	public static void XuatMang(float a[]) {
		System.out.println("Danh sách phần tử trong mảng ");
		for (float i : a) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	} 
	
	public static float TongDuong(float a[]) {
		float sum=0;
		for(int i =0;i<a.length;i++) {
			if(a[i]>0)
				sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a[]=Taomang(scan);
		XuatMang(a);
		System.out.println("tổng các số trong mảng có giá trị lớn hơn 0 là: Tổng = "+TongDuong(a));
	}

}
