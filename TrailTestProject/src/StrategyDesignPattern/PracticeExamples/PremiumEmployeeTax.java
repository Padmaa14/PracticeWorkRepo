package StrategyDesignPattern.PracticeExamples;

public class PremiumEmployeeTax implements TaxCalcuatorInterface {

	@Override
	public void calculateTaxYearly() {
		// TODO Auto-generated method stub
		System.out.println("tax calculate 50% of income");
	}

}
