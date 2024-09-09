import java.util.Scanner;

public class NguyentoCuoiCung {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = InPut(scan);
		OutPut(a);
		int temp = NguyentoCuoiCung(a);
		if (temp == -1)
			System.out.println(temp);
		else
			System.out.println("Vị trí " + temp + " có giá trị nguyên tố cuối cùng trong mảng ");
	}

	public static int[] InPut(Scanner scan) {
		System.out.println("Nhập vào số phần phần tử của mảng ");
		int n;
		do {
			System.out.println("Nhập n>0 ");
			 n=Integer.parseInt(scan.nextLine());
		}while( n <=0);
		int a[]=new int[n];
		for(int i =0;i<n;i++) {
			System.out.println("a["+i+"]: ");
			a[i]=Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	public static void OutPut(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]:"+a[i]+"\t\t");
		}
		System.out.println();
	}
	public static Boolean prime(int k) {
		if(k<2)
			return false;
		for(int i=2;i<=Math.sqrt(k);i++) {
			if(k%i==0)
				return false;
		}
		return true;
	}
	public static int NguyentoCuoiCung(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			if(prime(a[i]))
				return i;
		}
		return -1;
	}
}
