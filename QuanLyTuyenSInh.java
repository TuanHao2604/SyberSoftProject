import java.util.Scanner;

public class XULY {

	final static float KhuVucA = 2;
	final static float KhuVucB = 1;
	final static float KhuVucC = (float) 0.5;
	final static float DoiTuong1 = (float) 2.5;
	final static float DoiTuong2 = (float) 1.5;
	final static float DoiTuong3 = 1;
	static float Mon1, Mon2, Mon3, DiemChuan;
	static int DoiTuong;
	static String KhuVuc;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NhapDiem(scan);
		NhapKhuVuc(scan);
		NhapDoiTuong(scan);
		NhapDiemChuan(scan);
		Check(DoiTuong, KhuVuc);
	}

	public static void NhapDiem(Scanner scan) {
		System.out.println("Mời bạn nhập điểm thứ nhất");
		Mon1 = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập điểm thứ hai");
		Mon2 = Integer.parseInt(scan.nextLine());
		System.out.println("Mời bạn nhập điểm thứ ba");
		Mon3 = Integer.parseInt(scan.nextLine());
	}

	public static void NhapKhuVuc(Scanner scan) {
		System.out.println("Nhập khu vực của thí sinh ");
		KhuVuc = scan.nextLine();
	}

	public static void NhapDoiTuong(Scanner scan) {
		System.out.println("Nhập đối tượng của thí sinh ");
		DoiTuong = Integer.parseInt(scan.nextLine());
	}

	public static void NhapDiemChuan(Scanner scan) {
		System.out.println("Mời bạn nhập điểm chuẩn ");
		DiemChuan = Float.parseFloat(scan.nextLine());
	}

	public static float QuyDoiKhuVuc(String KhuVuc) {
		if (KhuVuc.equals("A")) {
			return KhuVucA;
		} else if (KhuVuc.equals("B")) {
			return KhuVucB;
		} else if (KhuVuc.equals("C")) {
			return KhuVucC;
		} else {
			return 0;
		}
	}

	public static float QuyDoiDoiTuong(int DoiTuong) {
		if (DoiTuong == 1) {
			return DoiTuong1;
		} else if (DoiTuong == 2) {
			return DoiTuong2;
		} else {
			return DoiTuong3;
		}
	}
	
	public static void Check(int DoiTuong, String KhuVuc) {
		float Sum=Mon1+Mon2+Mon3+QuyDoiKhuVuc(KhuVuc)+QuyDoiDoiTuong(DoiTuong);
		if(Sum>DiemChuan)
			System.out.println("Bạn đã đậu với số điểm "+ Sum);
		else
			System.out.println("Bạn đã rớt với số điểm "+Sum);
	}
}
