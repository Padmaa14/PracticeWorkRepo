package StrategyDesignPattern.PracticeExamples;

public class PremiumEmployee extends EmployeeTaxCalcuation {

	PremiumEmployee() {
		super(new PremiumEmployeeTax());
		// TODO Auto-generated constructor stub
	}

}
