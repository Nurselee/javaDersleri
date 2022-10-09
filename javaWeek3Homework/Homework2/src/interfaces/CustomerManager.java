package interfaces;

public class CustomerManager {

	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public void add() {
		//iþ kodlarý
		customerDao.add();
		
	}
}
