package loopDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For
				for (int i = 1; i < 10; i++) {
					System.out.println(i);
				}
				System.out.println("For döngüsü bitti");
				
				for (int i = 1; i < 10; i+=2) {
					System.out.println(i);
				}
				System.out.println("For döngüsü bitti");
				
				for (int i = 2; i < 10; i+=2) {
					System.out.println(i);
				}
				System.out.println("For döngüsü bitti");
				
				//While
				int i=1;
				while(i<10) {
					System.out.println(i);
					i++;
				}
				System.out.println("While döngüsü bitti");
				
				//do-while döngüsü
				int j=1;
				do {
					System.out.println(j);
					j+=2;
				} while (j<10);
				System.out.println("Do - While döngüsü bitti");
				
				int k=100;
				do {
					System.out.println(k);
					k+=2;
				} while (k<10);
				System.out.println("Do - While döngüsü bitti");

	}

}
