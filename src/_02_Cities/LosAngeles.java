package _02_Cities;

public class LosAngeles extends City{
	double factor;
	double mafia;
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		factor =population*growthRate;
		mafia=growthRate/2;
	}

	@Override
	double getAnnualTaxes() {
		double answer =factor*mafia;
		return answer;
	}
	
}
