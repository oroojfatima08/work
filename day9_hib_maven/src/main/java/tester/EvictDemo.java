package tester;

import org.hibernate.*;

import pojos.Vendor;

import static utils.HibernateUtils.*;

public class EvictDemo {

	public static void main(String[] args) {
		try {
			Vendor v = null;
			Session hs = getSf().getCurrentSession();
			// tx
			Transaction tx = hs.beginTransaction();
			try {
				v = hs.get(Vendor.class, 5);
				//v -- persistent
				v.setRegAmount(v.getRegAmount()+100);
				hs.evict(v);
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				throw e;
			} 

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();// cn pool will be destroyed.
		}

	}

}
