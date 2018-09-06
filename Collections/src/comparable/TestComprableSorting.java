package comparable;

import java.util.ArrayList;
import java.util.Collections;

import comparable.Student;

public class TestComprableSorting {

	public static void main(String[] args) {
		
		 ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(104, "Chaitanya", 26));
		   arraylist.add(new Student(102, "Rahul", 24));
		   arraylist.add(new Student(103, "Ajeet", 32));
		   arraylist.add(new Student(101, "Rajinder", 46));
		   arraylist.add(new Student(105, "Laksman", 12));
		   arraylist.add(new Student(100, "Sweety", 22));

		   Collections.sort (arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
	}

}
