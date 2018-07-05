package tester;

import java.util.Scanner;

import dao.VendorDao;
import pojos.Vendor;

import static utils.HibernateUtils.*;

public class GetAllVendors {

	public static void main(String[] args) {
		try {
			getSf();// hib frmwork loaded --booted.
			System.out.println(new VendorDao().fetchAllVendors());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();// cn pool will be destroyed.
		}

	}

}
