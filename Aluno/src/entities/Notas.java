package entities;

public class Notas {
	public double primeira;
	public double segunda;
	public double terceira;
	public String nome;
	
	public double FinalGrade() {
		if((primeira + segunda + terceira) >= 60) {
		return primeira + segunda + terceira;
		}else if(primeira + segunda + terceira <=60) {
			double soma = primeira + segunda + terceira;
			double missing = 60 - soma;
			return missing;
		}else{
			return 0;
		}
	}
	public String toString() {
		if(primeira + segunda + terceira >= 60) {
			return "PASS, Final Grade: " + FinalGrade(); 
		}else {
		return "Failed, missing points: " + FinalGrade();
	}
	} 
	
}
