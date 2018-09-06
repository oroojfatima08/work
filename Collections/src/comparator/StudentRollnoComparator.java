package comparator;
import java.util.Comparator;

import comparator.Student;

public class StudentRollnoComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRollno()==s2.getRollno())
		return 0;
		else if (s1.getRollno()>s2.getRollno())
			return 1;
		else
		return -1;
		
	}

}
