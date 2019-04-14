package _02_Cities;

public class Boston extends City {
	double factor;
	double factor2;
	public Boston(int population, double growthRate) {
		super(population, growthRate);
		factor=population*0.5;
		factor2=population*growthRate;
	}

	@Override
	double getAnnualTaxes() {
	double answer=factor+factor2;
		return answer;
	}

}
