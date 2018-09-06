package comparator;

public class Student {
	
	
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
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", age=" + age + "]";
	}

	
}
