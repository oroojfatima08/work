package dao;

import static utils.HibernateUtils.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Employee;

public class EmployeeDao 
{
public void addEmployee(Employee emp) throws Exception
{
	
	Session hs= getSf().openSession();
	Transaction tx= hs.beginTransaction();
    
        try {
			hs.saveOrUpdate(emp);
			System.out.println("Employee added successfully");
			
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();throw e;
			
		}
       
        }
public void testL1()
{
	/*Employee fetchEmp=null;
	Session session1 = getSf().openSession();
	session1.beginTransaction();

	fetchEmp = (Employee)session1.get(Employee.class, 1);
	System.out.println(fetchEmp);


	Employee fetchEmp1 = (Employee)session1.get(Employee.class, 1);
	System.out.println(fetchEmp1);

	session1.getTransaction().commit();
	session1.close();*/
	
	
	
	Session session1 = getSf().openSession();
	session1.beginTransaction();
	Session session2 = getSf().openSession();
	session2.beginTransaction();
	
	try {
		Employee fetchEmp1 = (Employee)session1.get(Employee.class, 1);
		System.out.println(fetchEmp1);
		
		fetchEmp1 = (Employee)session2.get(Employee.class, 1);
		System.out.println(fetchEmp1);

	}
	finally {
		
		session1.getTransaction().commit();
		session1.close();
		session2.getTransaction().commit();
		session2.close();
		
	}
	
}
public void testL2()
{
	Employee fetchEmp=null;
	Session session1 = getSf().openSession();
    session1.beginTransaction();
    fetchEmp = (Employee)session1.get(Employee.class, 1); //1 is empId already saved in database
    System.out.println(fetchEmp);
    session1.getTransaction().commit();
    session1.close();
    
    Session session2 = getSf().openSession();
    session2.beginTransaction();
    fetchEmp = (Employee)session2.get(Employee.class, 1);
    System.out.println(fetchEmp);
    session2.getTransaction().commit();
    session2.close();
}
public void querylevel()
{
	 Employee fetchEmp=null;
	 Session session3 = getSf().openSession();
     session3.beginTransaction();
     Query q1 = session3.createQuery("from Employee where empId=1"); //1 is empId already saved in database
     q1.setCacheable(true);
     fetchEmp = (Employee) q1.uniqueResult();
     System.out.println(fetchEmp);
     session3.getTransaction().commit();
     session3.close();
     
     Session session4 = getSf().openSession();
     session4.beginTransaction();
     Query q2 = session4.createQuery("from Employee where empId=1");
     q2.setCacheable(true);
     fetchEmp = (Employee) q2.uniqueResult();
     System.out.println(fetchEmp);
     session4.getTransaction().commit();
     session4.close();
}

	}
	

	

