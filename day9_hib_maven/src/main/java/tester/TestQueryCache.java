package tester;

import org.hibernate.*;

import pojos.Vendor;

import static utils.HibernateUtils.*;

public class TestQueryCache {

	public static void main(String[] args) {
		try {
			Vendor v = null;
			Session hs = getSf().getCurrentSession();
			// tx
			Transaction tx = hs.beginTransaction();
			try {
				String jpql = "select v from Vendor v where v.id = :vid";
				v = hs.createQuery(jpql, Vendor.class).
						setParameter("vid", 5).getSingleResult();
				v = hs.createQuery(jpql, Vendor.class).
						setParameter("vid", 5).getSingleResult();
		
				v = hs.createQuery(jpql, Vendor.class).
						setParameter("vid", 5).getSingleResult();
		
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				throw e;
			}
			System.out.println("Vendor dtls " + v);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();// cn pool will be destroyed.
		}

	}

}
