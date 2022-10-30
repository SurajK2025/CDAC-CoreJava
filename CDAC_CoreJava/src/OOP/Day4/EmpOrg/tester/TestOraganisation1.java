package OOP.Day4.EmpOrg.tester;
import java.util.Scanner;

import OOP.Day4.EmpOrg.pojo.Employee;
import OOP.Day4.EmpOrg.pojo.Manager;
import OOP.Day4.EmpOrg.pojo.Worker;

public class TestOraganisation1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee []employees = new Employee[20];
		int index=0;
		int choice;
		do {
			System.out.println("***SURAJ KHOKRALE DEVELOPERS***");
			System.out.println("1.Hire Manager\n2.Hire Worker\n3.Display All Employee\n4.Update Basic Sal\n10.Exit\nMake A Choice:");
			choice = sc.nextInt();
			switch(choice) {

			case 1 : System.out.println("Enter First Name, Last Name, Department Number, Basic Salary and Performance Bonus");
			employees[index]= new Manager(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			index++;
			break;

			case 2 : System.out.println("Enter First Name, Last Name, Department Number, Basic Salary, Hours Worked and Hourly Rate");
			employees[index]= new Worker(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble());
			index++;	
			break;

			case 3 : for(Employee emp : employees) {
				if(emp!=null)
					System.out.println(emp.toString()+" Net Salary : "+emp.computeNetSal());
			}
			break;

			case 4 :  
				boolean empFound=false;
				System.out.println("Enter the EMPID and SAL INCREMENT");
				int temp = sc.nextInt();
				double inc = sc.nextDouble();
				for(Employee emp : employees) {
					if(emp!=null) {
						if(emp.getEmpId()==temp) {
							emp.setBasicSal(emp.getBasicSal()+inc);
							empFound=true;
							break;
						}
					}
				}
				if(!empFound)
					System.out.println("Invalid EMPID!!!");
				break;
			case 10 : System.out.println("THANK YOU");
				break;

			}
		}while(choice!=10 && index < 20);

	}

}
