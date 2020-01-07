package com.musthafa.spring.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.musthafa.spring.models.Employee;

@Repository
public class EmployeeDaoImplementation implements EmployeeDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(e);
		return 1;
	}

	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(e);
		return 1;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> employeeList = session.createQuery("from Employee").list();
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Employee> employeeList = session.createQuery("from Employee E WHERE E.employeeId = " + id).list();
		System.out.println(employeeList);
		if (employeeList.size() != 0)
			return employeeList.get(0);
		return null;
	}

	public int removeEmployee(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Employee p = (Employee) session.load(Employee.class, new Integer(id));
		if (null != p) {
			session.delete(p);
			return 1;
		}
		return 0;
	}

}
