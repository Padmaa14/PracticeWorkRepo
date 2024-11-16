package StrategyDesignPattern.PracticeExamples;

public class EmployeeTaxCalcuation {
	private TaxCalcuatorInterface taxCalcuatorInterfaceObj;

	EmployeeTaxCalcuation(TaxCalcuatorInterface taxCalcuatorInterface) {
		this.taxCalcuatorInterfaceObj = taxCalcuatorInterface;
	}
	
	public void getTax() {
		taxCalcuatorInterfaceObj.calculateTaxYearly();
	}

}
