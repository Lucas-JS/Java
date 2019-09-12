package entities;

public class CompanyPayer extends TaxPayer {

	private Integer numberOfEmployees;

	public CompanyPayer() {
		super();
	}
	
	public CompanyPayer(String name, double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double aux = 0.0;
		if(numberOfEmployees <= 10) {
			aux = super.getAnnualIncome()*.16;
		}else {
			aux = super.getAnnualIncome()*.14;
		}
		
		return aux;
	}
	
	
}
