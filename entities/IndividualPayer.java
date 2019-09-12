package entities;

public class IndividualPayer extends TaxPayer{

	private Double healthExpenditures;
	
	public IndividualPayer() {
		super();
	}
	
	public IndividualPayer(String name, double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double aux = 0.0;
		if(super.getAnnualIncome()< 20000.0) {
			aux = super.getAnnualIncome()*.15;
		}else {
			aux = super.getAnnualIncome()*.25;
		}
		
		return aux - healthExpenditures * .5;
	}
	
	
}
