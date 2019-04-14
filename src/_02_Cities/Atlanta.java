package _02_Cities;

public class Atlanta extends City{
	double factor;
	double bonus;
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		factor=population*(growthRate*2);
	}

	@Override
	double getAnnualTaxes() {
		double sum=factor+bonus;
		return factor;
	}

}
