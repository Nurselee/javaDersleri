package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 27;
		int total = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				total = total + i;
			}
		}
		if (total == sayi) {
			System.out.println(sayi + " m�kemmel say�d�r.");
		}
		else {
			System.out.println("m�kemmel say� de�ildir.");
		}

	}

}
