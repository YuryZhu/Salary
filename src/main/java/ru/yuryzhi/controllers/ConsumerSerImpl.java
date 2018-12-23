package ru.yuryzhi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yuryzhi.dao.EmployeeDAO;

import javax.transaction.Transactional;

@Service
public class ConsumerSerImpl {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public void addContact(String fname, String lname, int salary) {
        employeeDAO.addContact(fname,lname,salary);
    }
}
