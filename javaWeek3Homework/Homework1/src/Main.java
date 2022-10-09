
public class Main {

	public static void main(String[] args) {
		/*
		 * int sayi1 = 10; int sayi2 = 20;
		 * 
		 * sayi1 =sayi2; sayi2 = 1000; System.out.println(sayi1);
		 * 
		 * 
		 * int[] sayilar1 = {1,2,3}; int[] sayilar2 = {10,20,30};
		 * 
		 * sayilar1= sayilar2; sayilar2[0] = 1000;
		 * 
		 * System.out.println(sayilar1[0]);
		 */

		/*CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();

		customer.setId(1);
		customer.setCity("Ankara");

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.setTaxNumber("3456787654");
		company.setCompanyName("Arçelik");
		company.setId(100);

		CustomerManager customerManager2 = new CustomerManager(new Person());

		Person person = new Person();
		person.setNationalIdentity("23231313");

		Customer c1 = new Customer();
		Customer c2 = new Company();
		Customer c3 = new Person();*/
		
		
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		
		customerManager.giveCredit();
	}

}
