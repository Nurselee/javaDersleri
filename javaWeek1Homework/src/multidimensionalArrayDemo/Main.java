package multidimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] sehirler = new String[3][3];
		
		sehirler[0][0]="�stanbul1";
		sehirler[0][1]="�stanbul2";
		sehirler[0][2]="�stanbul3";
		sehirler[1][0]="�stanbul4";
		sehirler[1][1]="�stanbul5";
		sehirler[1][2]="�stanbul6";
		sehirler[2][0]="�stanbul7";
		sehirler[2][1]="�stanbul8";
		sehirler[2][2]="�stanbul9";
		
		for (int i = 0; i <=2; i++) {
			System.out.println("--------------");
			for (int j = 0; j <= 2; j++) {
			System.out.println(sehirler[i][j]);
			}
		}

	}

}
