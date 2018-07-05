package tester;

import org.hibernate.*;

import pojos.Vendor;

import static utils.HibernateUtils.*;

public class TestOpenSession {

	public static void main(String[] args) {
		try {
			Vendor v = null;
			Session hs = getSf().openSession();
			Session hs1 = getSf().openSession();
			Session hs2 = getSf().openSession();
			System.out.println(hs == hs1);
			System.out.println(hs == hs2);
			// tx
			Transaction tx = hs.beginTransaction();
			try {
				v = hs.get(Vendor.class, 5);
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				throw e;
			} finally {
				System.out.println
				("hs open " + hs.isOpen() 
				+ " hs connected to db conn " + hs.isConnected());
				if (hs != null)
					hs.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();// cn pool will be destroyed.
		}

	}

}
