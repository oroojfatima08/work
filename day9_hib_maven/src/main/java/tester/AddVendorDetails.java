package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import dao.VendorDao;
import pojos.Vendor;
import utils.HibernateUtils;

public class AddVendorDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat
					("dd-MM-yyyy");
			// to create singleton immutable SF
			HibernateUtils.getSf();
			System.out.println("Enter vendor details nm em city ph amt dt ");
			// create transient POJO
			Vendor v = new Vendor(sc.next(), 
					sc.next(), sc.next(), sc.next(), 
					sc.nextDouble(), sdf.parse(sc.next()));
			// create dao inst , invoke CRUD method & display result
			System.out.println(
					new VendorDao().saveDetails(v));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtils.getSf().close();
		}

	}

}
