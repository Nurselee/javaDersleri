
public class Company extends Customer {

	private String taxNumber;

	private String companyName;

	public String getTaxNumber() {
		return taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
