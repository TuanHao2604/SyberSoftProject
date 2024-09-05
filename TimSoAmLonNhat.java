import java.util.Scanner;

public class TimSoAmLonNhat {

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
	
	public static Boolean CheckAm(int k) {
		return k<0;
	}
	public static void SoAmLonNhat(int a[][], int row, int column) {
		Boolean flag=false;
		int SoAmLonNhat=Integer.MIN_VALUE;
		Integer cot=null,hang=null;
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				if(CheckAm(a[i][j])&&a[i][j]>SoAmLonNhat) {
					flag=true;
					SoAmLonNhat=a[i][j];
					hang=i;
					cot=j;
				}
			}
		}
		if(!flag)
			System.out.println("Mảng ko có số âm ");
		else 
			System.out.println("Số âm lớn nhất trong là "+SoAmLonNhat+"["+hang+"]["+cot+"]");
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
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = Nhapcot(scan);
		int column = Nhapdong(scan);
		int a[][] = TaoMang2Chieu(scan, row, column);
		XuatMang(a, row, column);
		SoAmLonNhat(a, row, column);
	}
}
