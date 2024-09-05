import java.util.Scanner;

public class Tonggiatritrendong {

	static final int Max = 50;
	static final int Min = -50;

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
				a[i][j] = Min + (int) (Math.random() * (Max - Min) + 1);
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
	public static void TongDong(int a[][], int row, int column) {
		for(int i =0;i<column;i++) {
			int sum=0;
			for(int j=0;j<row;j++) {
				sum+=a[i][j];
			}
			System.out.println("Tổng giá trị trên dòng "+i+" = "+sum);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = Nhapcot(scan);
		int column = Nhapdong(scan);
		int a[][] = TaoMang2Chieu(scan, row, column);
		XuatMang(a, row, column);
		TongDong(a, row, column);
	}


}
