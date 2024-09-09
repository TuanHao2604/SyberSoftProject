import java.util.Scanner;

public class vitrichandautien {

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

	public static int VitriChanDautien(int a[]) {
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				return i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a[]=InPut(scan);
		OutPut(a);
		int temp=VitriChanDautien(a);
		if(temp==-1)
			System.out.println(temp);
		else
		System.out.println("Vị trí "+temp+" có giá trị chẳn đầu tiên ");
	}


}
