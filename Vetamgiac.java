
public class Vetamgiac {

	public static void Vetamgiaccandac(int ChieuCao) {
		for (int i = 1; i <= ChieuCao; i++) {
			int soCot = i * 2 - 1;
			int soDauCach = ChieuCao - i;
			for (int j = 1; j <= soDauCach; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= soCot; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Vetamgiaccanrong(int ChieuCao) {
		for (int i = 1; i <= ChieuCao; i++) {
			int SoCot = i * 2 - 1;
			int soDauCach = ChieuCao - i;
			for (int j = 1; j <= soDauCach; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= SoCot; j++) {
				if (j == 1 || j == SoCot || i == ChieuCao)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Vetamgiaccandac(5);
		Vetamgiaccanrong(5);

	}

}
