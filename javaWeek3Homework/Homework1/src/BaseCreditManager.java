
public abstract class BaseCreditManager implements ICreditManager{ //abstract s�n�flar bizim i�in ortak operasyonlar� tutar.

	public abstract void calculate(); //ortak de�il her yerde de�i�ken o y�zden abstract olarak kal�yor.
	
	public void save() { // ama bu her yede ayn�
		System.out.println("Kaydedildi.");
	}
}
