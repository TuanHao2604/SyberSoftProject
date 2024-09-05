import java.util.Scanner;

public class Matrantoanduong {
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

	public static Boolean CheckMangToanDuong(int a[][], int row , int column) {
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				if(a[i][j]<0)
					return false;
			}
		}
		return true;
	}
	
	public static void KtraMangToanDuong(int a[][], int row,int column) {
		Boolean check=CheckMangToanDuong(a, row, column);
		if(check)
			System.out.println("Ma trận là ma trận toàn dương");
		else
			System.out.println("Ma trận không là ma trận toàn dương");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = Nhapcot(scan);
		int column = Nhapdong(scan);
		int a[][] = TaoMang2Chieu(scan, row, column);
		XuatMang(a, row, column);
		KtraMangToanDuong(a, row, column);
	}

}
