package StrategyDesignPattern.PracticeExamples;

public class StandardEmployee extends EmployeeTaxCalcuation{

	StandardEmployee() {
		super(new StandardEmployeeTax());
		// TODO Auto-generated constructor stub
	}

}
