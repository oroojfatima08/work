package tester;

import static utils.HibernateUtils.*;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MappingDao;
import pojos.Dept;
import pojos.Emp;

public class SaveDeptDetailsWithEmps {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			getSf();
			System.out.println("Enter dept name");
			Dept d1 = new Dept(sc.next());
			ArrayList<Emp> l1 = new ArrayList<>();
			while (true) {
				System.out.println("Enter emp dtls : quit to stop");
				{
					String nm = sc.next();
					if (nm.equals("quit"))
						break;
					l1.add(new Emp(nm));

				}
			}
			d1.setEmps(l1);
			// invoke dao 's method for persistence
			System.out.println(new MappingDao().saveDetails(d1));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();
		}

	}

}
