package ru.yuryzhi.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.yuryzhi.integrationDB.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    public static SessionFactory factory;


    public void addContact(String fname, String lname, int salary) {

        Employee employee = new Employee(fname, lname, salary);
        factory.getCurrentSession().save(employee);

    }

//	public List<Employee> listContact() {
//
//		return sessionFactory.getCurrentSession().createQuery("from Employee")
//			.list();
//	}
}
