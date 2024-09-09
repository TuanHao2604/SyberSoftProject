import java.util.Scanner;

public class FindMinIndex {
	
	public static float[] InPut(Scanner scan) {
		System.out.println("Nhập vào số phần phần tử của mảng ");
		int n;
		do {
			System.out.println("Nhập n>0 ");
			 n=Integer.parseInt(scan.nextLine());
		}while( n <=0);
		float a[]=new float[n];
		for(int i =0;i<n;i++) {
			System.out.println("a["+i+"]: ");
			a[i]=Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static void OutPut(float a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]:"+a[i]+"\t\t");
		}
		System.out.println();
	}
	public static int MinIndex(float a[]) {
		float Min=a[0];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<Min) {
				Min=a[i];
				index=i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		float a[]=InPut(scan);
		OutPut(a);
		System.out.println("Vị trí có giá trị nhỏ nhất là: "+MinIndex(a));
	}

}
