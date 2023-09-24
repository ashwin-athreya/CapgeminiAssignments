package work;

public class EmployeeSalaryContd {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
         EmployeeSalary e1 = new EmployeeSalary(500,8,4);
         
         //e1.setHr_pay(500); if we do not use parameterized constructor
         //e1.setHr_reg(8);  if we do not use parameterized constructor
         //e1.setHr_over(4);  if we do not use parameterized constructor
         
         e1.CalculateSalary();
         e1.display();
         
	}

}
