package OOP.Day4.EmpOrg.pojo;

public class Worker extends Employee {

private int hoursWorked;
private double hourlyRate;
	
	public Worker(String fname,String lname, int deptId, double basicSal, int hoursWorked, double hourlyRate){
		super(fname,lname,deptId,basicSal);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	public double getHourRate() {
		return this.hourlyRate;
	}

	@Override
	public String toString() {
		return super.toString()+" Hours Worked: "+this.hoursWorked+" Hourly Rate: "+this.hourlyRate;
	}
	
	@Override
	public double computeNetSal() {
		return super.getBasicSal() + this.hoursWorked*this.hourlyRate;
	}

}
