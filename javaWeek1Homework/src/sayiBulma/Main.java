package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==aranacak) {
				varMi=true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Aranan sayý listede var");
		}
		else {
			System.out.println("Aradýðýnýz sayý mevcut deðil.");
		}

	}

}
