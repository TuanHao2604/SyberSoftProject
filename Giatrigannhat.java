import java.util.Scanner;

public class Giatrigannhat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a[] = InPut(scan);
		OutPut(a);
		KhoangCachNhoNhat(a, scan);
	}

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
			a[i]=Float.parseFloat(scan.nextLine());
		}
		return a;
	}
	
	public static void OutPut(float a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]:"+a[i]+"\t\t");
		}
		System.out.println();
	}
	public static void KhoangCachNhoNhat(float a[], Scanner scan) {
		System.out.println("Mời nhập vao giá trị x ");
		float x=Float.parseFloat(scan.nextLine());
		float b[]=new float[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=Math.abs(a[i]-x);
		}
		int indexMin=0;
		for(int i=1;i<a.length;i++) {
			if(b[i]<b[indexMin])
				indexMin=i;
		}
		System.out.println("Các phần tử gần giá trị x "+x +" nhất là: ");
		for(int i=0;i<a.length;i++) {
			if(b[i]==b[indexMin]) {
				System.out.print("a["+i+"]: "+a[i]+"\t ");
			}
		}
	}

}
