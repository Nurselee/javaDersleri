package interfaces;

public class CustomerManager {

	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public void add() {
		//i� kodlar�
		customerDao.add();
		
	}
}
