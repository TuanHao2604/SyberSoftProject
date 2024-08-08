import java.util.Scanner;

public class vitriduongtron {

	public vitriduongtron() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Vui lòng nhập tọa độ x của tâm đường tròn: ");
		float Xtam=Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tọa độ y của tâm đường tròn: ");
		float Ytam=Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập bán kính đường tròn: ");
		final float BanKinh=Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tọa độ x của điểm M ");
		float XM=Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tọa độ y của điểm M ");
		float YM=Float.parseFloat(scan.nextLine());
		float KhoangCach=(float)Math.sqrt((XM-Xtam)*(XM-Xtam)+(YM-Ytam)*(YM-Ytam));
		if(KhoangCach>BanKinh) {
			System.out.println("Điểm M nằm ngoài đường tròn ");
		}
		else if(KhoangCach<BanKinh) {
			System.out.println("Điểm M nằm trong đường tròn ");
		}
		else {
			System.out.println("Điểm M nằm trên đường tròn ");
			}
		}
	}


