package StrategyDesignPattern.PracticeExamples;

public class ContractBasedEmployeeTax implements TaxCalcuatorInterface {

	@Override
	public void calculateTaxYearly() {
		System.out.println("tax calculate 35% of income");
		
	}

}
