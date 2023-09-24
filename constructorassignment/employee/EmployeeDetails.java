package constructorAssignment;

public class EmployeeDetails {
	
	private String empName;
	private char empGender;
	private double yearsOfExperience;
	private String designation;
	private double basicSalary;
	private String status;
	
	
	public EmployeeDetails() {
		
	}

	
	public EmployeeDetails(String empName, char empGender, double yearsOfExperience, String designation,
			double basicSalary, String status) {
		super();
		this.empName = empName;
		this.empGender = empGender;
		this.yearsOfExperience = yearsOfExperience;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.status = status;
	}


	public EmployeeDetails(String empName, char empGender) {
		super();
		this.empName = empName;
		this.empGender = empGender;
	}

	public EmployeeDetails(double yearsOfExperience /*String designation double basicSalary*/, String status) {
		super();
		this.yearsOfExperience = yearsOfExperience;
		/*this.designation = designation;*/
		/*this.basicSalary = basicSalary;*/
		status = status;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

	public double getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getDesignation() {
		
		String designation=null;
		if (yearsOfExperience<3 && yearsOfExperience>1)
	    {
			 designation =  "ASE";
	    }
		else if (yearsOfExperience>=3)
		{
			 designation = "ITA";
		}
		return designation;
		
	}

	public void setDesignation(String designation) {
		this.designation = designation;
		
	}

	public double getBasicSalary(String designation) {
		
		double basicSalary=10000;
		
		if(designation == "ASE") 
		{
			 basicSalary = 10000;
		}
		else 
		{
			 basicSalary = 20000;
		}
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		status = status;
	}
	
	public String promoteEmp(String designation) 
	{
		String finalDesignation=null;
		if(designation=="ASE") 
		{
			finalDesignation = "ITA";
		}
		else if(designation=="ITA") 
		{
			finalDesignation = "AST";
		}
		else if(designation=="AST") 
		{
			finalDesignation = "AST";
		}
		return finalDesignation;
	}
	
	
	public double promoteEmp2(String designation, double basicSalery) 
	{
		double finalSalary=0;
		if(designation=="ASE") 
		{
			finalSalary = basicSalery + (basicSalery*0.05);
		}
		else if(designation=="ITA") 
		{
			finalSalary = basicSalery + (basicSalery*0.08);
		}
		if(designation=="ASE") 
		{
			finalSalary = basicSalery + (basicSalery*0.10);
		}
		return finalSalary;
	}
	
	public void applyForLWP(EmployeeDetails emp) {
		status="Inactive";
		emp.setBasicSalary(0);
		
	}


	@Override
	public String toString() {
		return "EmployeeDetails [empName=" + empName + ", empGender=" + empGender + ", yearsOfExperience="
				+ yearsOfExperience + ", designation=" + designation + ", basicSalary=" + basicSalary + ", status="
				+ status + "]";
	}
	
	

}
