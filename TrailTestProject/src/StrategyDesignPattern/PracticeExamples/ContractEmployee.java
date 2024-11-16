package StrategyDesignPattern.PracticeExamples;

public class ContractEmployee extends EmployeeTaxCalcuation {
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
		super(new ContractBasedEmployeeTax());
	}

}
