package javaBasics;

public class Java07InheritanceChild extends Java06InheritanceSuper  {
	
	// Let's assume this class is for a full time employee
	
	public double FullTimeEmpBonus(double bonus) {
		return bonus;
	}
	
	public String FullTimeEmpMedicalBenefit(String insu) {
		return insu;
	}
	public static void main(String[] args) {
		Java07InheritanceChild Ic = new Java07InheritanceChild();
		
		Ic.empId = 111;
		Ic.EmployeeDepartment("It");
		Ic.EmployeeSalary(2500);
		Ic.FullTimeEmpBonus(1000);
		Ic.FullTimeEmpMedicalBenefit("Full coverage");

	}

}
