package ojas;

public class Student 
{
	public int student_id;
	public String student_name;
	private int marks;
	private String grade;
	
	public Student() 
	{

		student_id = 0;

		student_name = null;

		marks = 0;

		grade = " ";

	}
	
	public Student(int student_id, String student_name, int marks)
	{

		this.student_id = student_id;

		this.student_name = student_name;

		this.marks = marks;

		calculateGrade();

	}
		
	public int get_student_id() {
		return student_id;
	}

	public void set_student_id(int student_id) {
		this.student_id = student_id;
	}

	public String getstudent_name() {
		return student_name;
	}

	public void setstudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public String displayDetails()

	{

		return "Student [id="+ student_id + " ,name="+ student_name + " , marks=" + marks + ", grade= "+ grade+"]";

	}
	
	
	
	private void calculateGrade()
	{
		if(marks > 90)

		{

			grade = "A";

		}

		else if(marks > 80 && marks <= 90)

		{

			grade = "B";

		}

		else if(marks > 70 && marks <= 80)

		{

			grade = "C";

		}

		else if(marks > 60 && marks <= 70)

		{

			grade = "D";

		}

		else

		{

			grade = "E";

		}
	}
}
