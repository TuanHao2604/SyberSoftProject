import java.util.Scanner;

public class DoiTien {

	public DoiTien() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		final int TyGia=23500;
		System.out.println("Vui nhập số USD cần đổi ");
		float USD_Money=Float.parseFloat(scan.nextLine());
		float VND_Money=(float)TyGia*USD_Money;
		System.out.println("Số VND sau khi đổi là "+ VND_Money);
	}

}
