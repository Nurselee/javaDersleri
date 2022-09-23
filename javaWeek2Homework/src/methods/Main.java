package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();

	}
	
	public static void SayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==aranacak) {
				varMi=true;
				break;
			}
		}
		
		String mesaj= "";
		if (varMi) {
			mesaj = "Sayi mevcuttur." + aranacak;
			mesajVer(mesaj);
		}
		else {
			mesaj = "Sayi mevcut deðildir: " + aranacak;
			mesajVer(mesaj);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
