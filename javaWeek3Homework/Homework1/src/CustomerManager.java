
public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager; 
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müþteri kaydedildi.");
	}

	public void delete() {
		System.out.println("Müþteri silindi." );
	}
	
	public void giveCredit() {
		this.creditManager.calculate();
		System.out.println("Kredi verildi");
	}

}
