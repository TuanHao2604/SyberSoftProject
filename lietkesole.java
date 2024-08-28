import java.util.Scanner;

public class lietkesole {

	static final int Min = -1000;
	static final int Max = 1000;

	public static int[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng ");
			n = scan.nextInt();
		} while (n<1);
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Min + (int) (Math.random() * (Max - Min) + 1);
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
	

	public static Boolean Checkle(int k) {
		if(k%2!=0)
			return true;
		return false;
	}
	
	public static Boolean CheckToanle(int t) {
		int temp=Math.abs(t);
		Boolean flag = true;
		while(temp>0) {
			int m=temp%10;
			if(!Checkle(m))
				flag=false;
			temp/=10;
		}
		return flag;
	}
	
	public static void Lietkedayle(int a[]) {
		System.out.println("Danh sách các giá trị toàn số lẻ");
		for(int i = 0;i<a.length;i++) {
			if(CheckToanle(a[i]))
				System.out.print(a[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[]=Taomang(scan);
		XuatMang(a);
		Lietkedayle(a);
	}
}
