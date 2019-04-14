package _02_Cities;

public class SanDiego extends City{
	double factor;
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		 factor =population*growthRate;
	}

	@Override
	double getAnnualTaxes() {
		double sum=factor+1000000;
		return sum;
	}
}
