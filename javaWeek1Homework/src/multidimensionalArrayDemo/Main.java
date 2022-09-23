package multidimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] sehirler = new String[3][3];
		
		sehirler[0][0]="Ýstanbul1";
		sehirler[0][1]="Ýstanbul2";
		sehirler[0][2]="Ýstanbul3";
		sehirler[1][0]="Ýstanbul4";
		sehirler[1][1]="Ýstanbul5";
		sehirler[1][2]="Ýstanbul6";
		sehirler[2][0]="Ýstanbul7";
		sehirler[2][1]="Ýstanbul8";
		sehirler[2][2]="Ýstanbul9";
		
		for (int i = 0; i <=2; i++) {
			System.out.println("--------------");
			for (int j = 0; j <= 2; j++) {
			System.out.println(sehirler[i][j]);
			}
		}

	}

}
