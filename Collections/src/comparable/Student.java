package comparable;

public class Student implements Comparable<Student> {
	
	
	private int rollno;
	private String studname;
	private int age;
	
	

	public Student(int rollno, String studname, int age) {
		super();
		this.studname = studname;
		this.rollno = rollno;
		this.age = age;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/*@Override
	public int compareTo(Student student) {
		if(this.rollno==student.rollno)
		return 0;
		else if(this.rollno>student.rollno)
			return 1;
		else 
			return -1;
	}*/
	
	// above compareTo method with ternary operator
	@Override
	public int compareTo(Student student) {
		
		return this.rollno>student.rollno ? 1 : this.rollno<student.rollno ? -1 : 0 ;
	}	
	
	//compareTo method for 2 strings
	
	/*@Override
	public int compareTo(Student student) {
		return this.studname.compareTo(student.studname);
	}*/

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", age=" + age + "]";
	}

	
	
}
