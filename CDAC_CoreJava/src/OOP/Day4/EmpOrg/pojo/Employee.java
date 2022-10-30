package OOP.Day4.EmpOrg.pojo;

public abstract class Employee {
	
	private static int count;
	private int empid;
	private String fname;
	private String lname;
	private int deptId;
	private double basicSal;
	
	static {
		count = 100;
	}
	
	Employee(String fname,String lname, int deptId, double basicSal){
		this.empid=count;
		this.fname=fname;
		this.lname=lname;
		this.deptId=deptId;
		this.basicSal=basicSal;
		count++;	
	}
	
	public int getEmpId() {
		return this.empid;
	}
	
	public void setBasicSal(double basicSal) {
		this.basicSal=basicSal;
	}
	public double getBasicSal() {
		return this.basicSal;
	}
	
	public abstract double computeNetSal();
	
	
	
	@Override
	public String toString() {
		return "EmpId: "+this.empid+" Name: "+this.fname+this.lname+" DepartmentNo: "+this.deptId+" Basic Salary: "+this.basicSal;
	}
}