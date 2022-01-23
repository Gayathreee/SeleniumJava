package week1.day1;

public class Student {


	//Global variables
	String name = "Gayathri" ;
	protected int rollNumber = 832777;

	//Methods
	public String collegeTCE() {
		String localName = "Vikranth";
		return localName;
	}

	private String collegeGCT() {
		String localName = "Harikumar";
		return localName;
	} 

	String collegeCIT() {
		String localName = "Nirosha";
		return localName;
	}

	public static void main(String[] args) {
		Student student1 = new Student();

		//Print GLobal variables 		
		System.out.println("Student Name: " + student1.name + "Roll Number: " + student1.rollNumber);

		//Return with access modifier public
		System.out.println(student1.collegeTCE());

		//Return with access modifier private
		System.out.println(student1.collegeGCT());

		//Return with access modifier default
		System.out.println(student1.collegeCIT());

	}



}
