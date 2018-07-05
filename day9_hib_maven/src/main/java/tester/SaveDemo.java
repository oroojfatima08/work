package tester;

import org.hibernate.*;

import pojos.Vendor;

import static utils.HibernateUtils.*;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SaveDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter vendor details nm em city ph amt dt ");
			// create transient POJO
			Vendor v = new Vendor(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			v.setId(123);
			Session hs = getSf().getCurrentSession();
			// tx
			Transaction tx = hs.beginTransaction();
			try {
				Integer id=(Integer)hs.save(v);
				System.out.println("generated id  "+id);
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
