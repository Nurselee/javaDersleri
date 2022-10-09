package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
				{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
			System.out.println(baseKrediManager.hesapla(1000));
		}
	}

}
