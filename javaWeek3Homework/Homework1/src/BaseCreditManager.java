
public abstract class BaseCreditManager implements ICreditManager{ //abstract sýnýflar bizim için ortak operasyonlarý tutar.

	public abstract void calculate(); //ortak deðil her yerde deðiþken o yüzden abstract olarak kalýyor.
	
	public void save() { // ama bu her yede ayný
		System.out.println("Kaydedildi.");
	}
}
