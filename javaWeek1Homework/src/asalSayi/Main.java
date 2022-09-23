package asalSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -1;
		// int remainder = number % 2 ;
		// System.out.println(remainder);
		boolean isPrime = true;
		
		if (number < 1) {
			System.out.println("Geçersiz sayý");
		}
		if (number == 1) {
			System.out.println("sayi asal deðildir.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime=false;
			}
		}
		if (isPrime) {
			System.out.println(number+" asal sayýdýr.");
		}
		else {
			System.out.println(number +" asal sayý deðildir.");
		}

	}

}
