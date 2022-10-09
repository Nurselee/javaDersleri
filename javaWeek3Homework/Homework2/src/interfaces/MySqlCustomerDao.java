package interfaces;

public class MySqlCustomerDao implements CustomerDao,Repository{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("My sql eklendi");
	}

}
