package OOP.Day4.EmpOrg.pojo;

public class Manager extends Employee {
	
	private double perfBonus;
	
	public Manager(String fname,String lname, int deptId, double basicSal, double perfBonus){
		super(fname,lname,deptId,basicSal);
		this.perfBonus=perfBonus;
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}
	
	@Override
	public double computeNetSal() {
		return this.perfBonus + super.getBasicSal();
	}
	
	@Override
	public String toString() {
		return super.toString()+" Performance Bonus: "+this.perfBonus;
	}



}
