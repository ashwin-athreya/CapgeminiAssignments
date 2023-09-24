package work;

public class EmployeeSalary {
	
	private float hr_pay;
	private int hr_reg;
	private int hr_over;
	
	
	public EmployeeSalary(float hr_pay, int hr_reg, int hr_over) {
	
		this.hr_pay = hr_pay;
		this.hr_reg = hr_reg;
		this.hr_over = hr_over;
	}

	public float getHr_pay()
	{
		return hr_pay;
	}

	public void setHr_pay(float hr_pay)
	{
		this.hr_pay = hr_pay;
	}


	public int getHr_reg() 
	{
		return hr_reg;
	}

	public void setHr_reg(int hr_reg)
	{
		this.hr_reg = hr_reg;
	}

	public int getHr_over() 
	{
		return hr_over;
	}

	public void setHr_over(int hr_over)
	{
		this.hr_over = hr_over;
	}
	

    
	public double CalculateSalary() 
    {
    	double normalSalary = hr_pay*hr_reg;
    	double overTimeSalary=1.5*hr_pay*hr_over;
    	double totalSalary =(normalSalary+overTimeSalary)*6;
    	
    	
    	return totalSalary;
    }
	
	public void display() 
	{
		
		System.out.println("the salary of the employee "+CalculateSalary());
	}


	

}
