import java.util.Scanner;

public class DuongNhoNhat_khoa3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a[] = InPut(scan);
		OutPut(a);
		int temp = VitriDuongNhoNhat(a);
		if (temp == -1)
			System.out.print(temp);
		else
			System.out.println("Vị trí " + temp + " có giá trị dương nhỏ nhất đầu tiên ");
	}

	public static float[] InPut(Scanner scan) {
		System.out.println("Nhập vào số phần phần tử của mảng ");
		int n;
		do {
			System.out.print("Nhập n>0 ");
			 n=Integer.parseInt(scan.nextLine());
		}while( n <=0);
		float a[]=new float[n];
		for(int i =0;i<n;i++) {
			System.out.print("a["+i+"]: ");
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

	public static int DuongDautien(float a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				return i;
		}
		return -1;
	}

	public static int VitriDuongNhoNhat(float a[]) {
		int index=DuongDautien(a);
		if(index==-1)
			return -1;
		float Min=a[index];
		for (int i =index; i < a.length; i++) {
			if (a[i] < Min && a[i] > 0) {
				Min = a[i];
				index = i;
			}
		}
		return index;
	}
}