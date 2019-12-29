package entities;

public class PJ extends Tax {
	private Integer numberEmployees;
	
	public PJ() {
		
	}
	
	public PJ(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		if(numberEmployees >10) {
			return getAnualIncome()*14/100;
		}else {
			return getAnualIncome()*16/100;
		}
	}

}
