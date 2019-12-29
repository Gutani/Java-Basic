package entities;

public class PF extends Tax {

	private Double healthExpenditures;
	
	public PF() {
		
	}
	
	
	public PF(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public Double tax() {
		if(getAnualIncome()<20000) {
			return getAnualIncome()*15/100 - healthExpenditures*50/100;
		}else {
			return getAnualIncome()*25/100 - healthExpenditures*50/100;
		}
	}

}
