import java.util.Scanner;

public class Tinhgiatritrungbinh {

	public Tinhgiatritrungbinh() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		final int SO=5;
		float[] a=new float[SO];
		float Temp=0;
		for(int i=0;i<SO;i++) {
			System.out.println("Vui lòng nhập số thứ "+(i+1));
			a[i]=Float.parseFloat(scan.nextLine());
			Temp+=a[i];
		}
		Temp/=(float)SO;
		System.out.println("Giá trị trung bình "+Temp );
	}	
}
