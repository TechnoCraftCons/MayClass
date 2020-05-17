package javaBasics;

public class Java08Inheritancechild2 extends Java06InheritanceSuper {
 // Let's assume this is for a part-time employee
	
	public String PTContractingCompany(String compName) {
		return compName;
	}
	public static void main(String[] args) {
		Java08Inheritancechild2 Ic2 =  new Java08Inheritancechild2();
		Ic2.empId = 2252;
		Ic2.EmployeeDepartment("Finance");
		Ic2.EmployeeSalary(26);
		Ic2.PTContractingCompany("Technocraft");
		

	}

}
