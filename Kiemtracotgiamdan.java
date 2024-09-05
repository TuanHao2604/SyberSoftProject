import java.util.Scanner;

public class Kiemtracotgiamdan {

	public static int Nhapdong(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập số dòng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int Nhapcot(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập số cột: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] TaoMang2Chieu(Scanner scan, int row, int column) {
		int a[][] = new int[column][row];
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.println("Nhập phần tử a["+i+"]["+j+"]");
				a[i][j] =Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}
	
	public static void XuatMang(int a[][], int row, int column) {
		System.out.println("Danh sách mảng 2 chiều : ");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}
	}
	public static Boolean CheckGiamdan(int a[][],int row, int column,int CotKtra) {
		for(int i=0;i<column-1;i++) {
			if(a[i][CotKtra]<a[i+1][CotKtra])
				return false;
		}
		return true;
	}
	public static void Ktracotgiamdan(int a[][],int row, int column,Scanner scan) {
		int CotKtra;
		do {
			System.out.println("Vui lòng nhập vào vị trí cột cần kiểm tra");
			CotKtra=Integer.parseInt(scan.nextLine());			
	}while(CotKtra<0 && CotKtra>row );
		Boolean check = CheckGiamdan(a, row, column, CotKtra);
		if(check) {
			System.out.println("Cột"+CotKtra+" là cột giảm dần");
		}
		else System.out.println("Cột"+CotKtra+" không là cột giảm dần");
		System.out.println("Bạn có muốn kiểm tra tiếp không? Nhấn khác 0 đến tiếp tục");
		int temp=Integer.parseInt(scan.nextLine());
		if(temp!=0) {
			Ktracotgiamdan(a, row, column, scan);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = Nhapcot(scan);
		int column = Nhapdong(scan);
		int a[][] = TaoMang2Chieu(scan, row, column);
		XuatMang(a, row, column);
		Ktracotgiamdan(a, row, column, scan);
	}

}
