package constructorAssignment;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails(3, "active");
		//System.out.println(emp.getDesignation());
		//System.out.println(emp.getBasicSalary(emp.getDesignation()));
		EmployeeDetails emp1 = new EmployeeDetails("Ramesh  ", 'M');
		System.out.print(emp1.getEmpName());
		System.out.println(emp1.getEmpGender());
		
		System.out.print(emp.promoteEmp(emp.getDesignation()));
		System.out.print("  ");
		System.out.println(emp.promoteEmp2(emp.getDesignation(), emp.getBasicSalary(emp.getDesignation())));
		EmployeeDetails emp2 = new EmployeeDetails("Mahesh  ", 'M');
		EmployeeDetails emp3 = new EmployeeDetails("Suresh  ", 'M');
		EmployeeDetails emp4 = new EmployeeDetails("Harsh", 'M', 4, "ITA", 15000, "Active");
        emp4.applyForLWP(emp4);
        
        System.out.println(emp4);
	}

}
