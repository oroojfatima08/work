package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorSorting {

	public static void main(String[] args) {
		
		 ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(104, "Chaitanya", 26));
		   arraylist.add(new Student(102, "Rahul", 24));
		   arraylist.add(new Student(103, "Ajeet", 32));
		   arraylist.add(new Student(101, "Rajinder", 46));
		   arraylist.add(new Student(105, "Laksman", 12));
		   arraylist.add(new Student(100, "Sweety", 22));
 
		  // Collections.sort (arraylist,new StudentRollnoComparator());
		  // Collections.sort (arraylist,new StudentNameComparator());
		   Collections.sort (arraylist,new StudentAgeComparator());

		   for(Student str: arraylist){
				System.out.println(str);
		   }
	}

}
