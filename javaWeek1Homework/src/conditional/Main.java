package conditional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 20;
		if (sayi < 20) {
			System.out.println("Say� 20'den k���kt�r.");
		}
		// if(sayi < 15){
		// System.out.println("Say� 15'den k���kt�r.");
		// }
		else {
			System.out.println("Say� 20'den b�y�kt�r.");
		}
		// tek e�ittir say�ya de�er atamak demektir.
		// < (k���kt�r), > (b�y�kt�r), == (e�ittir) operat�rleri,
		if (sayi < 20) {
			System.out.println("Say� 20'den k���kt�r.");

		} else if (sayi == 20) {
			System.out.println("Say� 20'ye e�ittir.");
		}
		// di�er durumlar� i�erir
		else {
			System.out.println("Say� 20'den b�y�kt�r.");
		}


	}

}
