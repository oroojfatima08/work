package dao;

import org.hibernate.*;
import pojos.*;
import static utils.HibernateUtils.*;

public class MappingDao {

	public String saveDetails(Dept myDept) {
		Session hs = getSf().getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			for(Emp e : myDept.getEmps()) {
				e.setDepartment(myDept);
				hs.persist(e);
			}
			hs.persist(myDept);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return "Dept info stored successfully with ID " + myDept.getDeptId();

	}

}
