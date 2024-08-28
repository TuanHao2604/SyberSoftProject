import java.util.Scanner;

public class LietKeChan {

	static final int Min = -100;
	static final int Max = 100;

	public static int[] Taomang(Scanner scan) {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số phần tử mảng (n>2,Chẵn) ");
			n = scan.nextInt();
		} while (n < 2 || n%2!=0);
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
	
	public static void InChan(int a[],Scanner scan) {
		System.out.println("Vui lòng nhập đoạn (x,y)");
		System.out.println("x= ");
		int x=scan.nextInt();
		System.out.println("y= ");
		int y=scan.nextInt();
		for(int i =0 ;i<a.length;i++) {
			if(a[i]>x && a[i]<y) {
				if(a[i]%2==0)
					System.out.print(a[i]+"\t");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[]= Taomang(scan);
		XuatMang(a);
		InChan(a, scan);
		

	}

}
