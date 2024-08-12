import java.util.Scanner;

public class Tinhthue {

	final static float thue1to60 = (float) 0.05;
	final static float thue60to120 = (float) 0.1;
	final static float thue120to210 = (float) 0.15;
	final static float thue210to384 = (float) 0.2;
	final static float thue384to624 = (float) 0.25;
	final static float thue624to960 = (float) 0.3;
	final static float thueover960 = (float) 0.35;

	static String Name;
	static float ThuNhap;
	static int Songuoiphuthuoc;

	public static void NhapThongTin(Scanner scan) {
		System.out.println("Nhập tên người nộp thuế ");
		Name = scan.nextLine();
		System.out.println("Nhập vào tổng thu nhập đơn vị triệu đồng");
		ThuNhap = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào số người phụ thuộc ");
		Songuoiphuthuoc = Integer.parseInt(scan.nextLine());
	}

	public static float tinhThuNhapChiuThue(Float ThuNhap, int Songuoiphuthuoc) {
		return (float) (ThuNhap - 4 - 1.6 * Songuoiphuthuoc);
	}

	public static float tinhThue(float ThuNhap, int Songuoiphuthuoc) {
		float Thue=0;
		float ThuNhapChiuThue=tinhThuNhapChiuThue(ThuNhap,Songuoiphuthuoc);
		if(ThuNhapChiuThue<=60){
			Thue = ThuNhapChiuThue*thue1to60;
		}else if(ThuNhapChiuThue<=120){
			Thue = 60*thue1to60+(ThuNhapChiuThue-60)*thue60to120;
		}else if(ThuNhapChiuThue<=210){
			Thue = 60*thue1to60+60*thue60to120+(ThuNhapChiuThue-120)*thue120to210;
		}else if(ThuNhapChiuThue<=384){
		 	Thue = 60*thue1to60+60*thue60to120+90*thue120to210+(ThuNhapChiuThue-210)*thue210to384;
		}else if(ThuNhapChiuThue<=624) {
			Thue = 60*thue1to60+60*thue60to120+90*thue120to210+174*thue210to384+(ThuNhapChiuThue-210)*thue384to624;
		}else if(ThuNhapChiuThue<=960) {
			Thue = 60*thue1to60+60*thue60to120+90*thue120to210+174*thue210to384+240*thue384to624+(ThuNhapChiuThue-624)*thue624to960;
		}else if(ThuNhapChiuThue>960) {
			Thue = 60*thue1to60+60*thue60to120+90*thue120to210+174*thue210to384+240*thue384to624+336*thue624to960+(ThuNhapChiuThue-960)*thueover960;
		}
		return Thue;
	}
	
	public static void XuatThongTin(float ThuNhap, int Songuoiphuthuoc, String Name) {
		float Thue=tinhThue(ThuNhap, Songuoiphuthuoc);
		System.out.println("Số thuế "+Name+" phải nộp "+Thue);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NhapThongTin(scan);
		XuatThongTin(ThuNhap, Songuoiphuthuoc, Name);
	}

}
