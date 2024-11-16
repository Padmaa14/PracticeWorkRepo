package StrategyDesignPattern.PracticeExamples;

public class Main {
	public static void main(String[] arg) {
		EmployeeTaxCalcuation emp = new StandardEmployee(); // to know tax for standard employee
		emp.getTax();
		EmployeeTaxCalcuation emp2 = new PremiumEmployee(); //// to know tax for Premium employee
		emp2.getTax();
		EmployeeTaxCalcuation emp3 = new ContractEmployee();// to know tax for contract employee
		emp3.getTax();

	}

}
