package conditional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 20;
		if (sayi < 20) {
			System.out.println("Sayý 20'den küçüktür.");
		}
		// if(sayi < 15){
		// System.out.println("Sayý 15'den küçüktür.");
		// }
		else {
			System.out.println("Sayý 20'den büyüktür.");
		}
		// tek eþittir sayýya deðer atamak demektir.
		// < (küçüktür), > (büyüktür), == (eþittir) operatörleri,
		if (sayi < 20) {
			System.out.println("Sayý 20'den küçüktür.");

		} else if (sayi == 20) {
			System.out.println("Sayý 20'ye eþittir.");
		}
		// diðer durumlarý içerir
		else {
			System.out.println("Sayý 20'den büyüktür.");
		}


	}

}
