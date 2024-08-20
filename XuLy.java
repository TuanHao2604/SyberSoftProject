import java.util.Scanner;

public class XuLy {

	public static int NguoiChon(Scanner scan) {
		System.out.println("1.Kim\n2.Kéo\n3.Bao\n0.Nghỉ chơi");
		int temp = scan.nextInt();
		return temp;
	}
	
	public static int AIChon() {
		int temp = (int) (Math.random()*3+1);
		return temp;
	}

	public static String Thongbao(int temp) {
		if(temp==1) 
			return "kim";
		else if(temp==2)
			return "Kéo";
		else 
			return "Bao";
	}
	
	public static void Xulygame(Scanner scan) {
		int Count=0,AiCount=0;
		while(true) {
			int Nguoi=NguoiChon(scan);
			int Ai=AIChon();
			if(Nguoi==0) {
				break;
			}
			if(Nguoi==1) {
				if(Ai==2)
					Count++;
				if(Ai==3)
					AiCount++;
			}
			if(Nguoi==2) {
				if(Ai==1)
					AiCount++;
				if(Ai==3)
					Count++;
			}
			if(Nguoi==3) {
				if(Ai==1)
					Count++;
				if(Ai==2)
					AiCount++;
			}
			if(Nguoi==Ai)
		    	System.out.println("Cả hai cùng chọn "+Thongbao(Nguoi));
			else {
				System.out.println("Người chơi chọn "+ Thongbao(Nguoi));
				System.out.println("Ai chọn "+ Thongbao(Ai));
			}
		}
		System.out.println("Tỷ số là người chơi :"+Count +"------"+"Ai: "+AiCount);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Xulygame(scan);
	}

}
