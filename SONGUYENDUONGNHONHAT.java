
public class SONGUYENDUONGNHONHAT {
	final static int  max = 10000;
	public static int SONGUYENDUONGNHONHAT() {
		int sum = 0;
		int i = 0;
		while(sum<=max) {
			sum+=i;
			i++;
		}
		return i-1;
	}

	public static void main(String[] args) {
		System.out.println("Số nhỏ nhất thỏa điều kiện là : "+SONGUYENDUONGNHONHAT());

	}

}
