package tester;

import java.util.Scanner;

import dao.VendorDao;
import pojos.Vendor;

import static utils.HibernateUtils.*;

public class GetVendorDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			getSf();// hib frmwork loaded --booted.
			System.out.println("Enter vendor id");
			Vendor v = new VendorDao().getDetails(sc.nextInt());
			System.out.println(v);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();// cn pool will be destroyed.
		}

	}

}
