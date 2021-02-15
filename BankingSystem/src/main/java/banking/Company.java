package banking;

public class Company  {
	private String companyName;
	int taxId;

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Company(String companyName, int taxId) {
		// complete the function
		this.companyName = companyName;
		this.taxId = taxId;
		
	}

	public String getCompanyName() {
		// complete the function
        return companyName;
	}
}
