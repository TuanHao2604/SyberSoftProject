import java.util.Scanner;

public class TinhLaiSuat {
	
	
	public static void Nhap(Scanner scan) {
		System.out.println("Vui lòng nhập số tiền gửi(tr) vào ");
		float TienGui=scan.nextFloat();
		System.out.println("Vui lòng nhập số tiền mong muốn (tr) vào ");
		float TienNhan=scan.nextFloat();
		System.out.println("Vui lòng nhập lãi suất gửi (%) từ 0-100 vào ");
		float Lai  = scan.nextFloat();
		System.out.println("Số Năm chờ là: "+(int)Math.ceil(TinhLaiSuat(Lai,TienGui,TienNhan)));
	}
	
	public static float TinhLaiSuat(double Lai, float TienGui, float TienNhan) {
		float Nam = (float) ((Math.log(TienNhan)-Math.log(TienGui))/(Math.log(1+Lai/100)));
		return Nam;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Nhap(scan);
	}
}
