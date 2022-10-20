package Cop.Day4.Student_1;


public class Student {
	private String name;
	private int rollno;
	int[] marks = new int[5];
	
	public void calcPercentage() {
		int per, total=0;
		for (int i:this.marks)
			total += i;
		per = total/5;
		
		System.out.println("\nTotal marks: "+total+"\nPercentage: "+per+"%");
		
		if(per > 75) System.out.println("Grade A");
		if(per > 60 && per <75) System.out.println("Grade B");
		if(per < 60) System.out.println("Grade C");
	}
	
	public Student(String name, int rollno, int[] marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
}