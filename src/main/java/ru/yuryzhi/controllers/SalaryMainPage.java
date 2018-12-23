package ru.yuryzhi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.yuryzhi.integrationDB.ManageEmployee;

import java.util.Map;

@Controller
public class SalaryMainPage {
    String param = "";
    @Autowired
    private ConsumerSerImpl consService;

    @RequestMapping("/")
    public String about(Map<String, Object> model) {
        model.put("salary_param", param);
        return "MySalary";
    }

    @RequestMapping(value = "/MySalary/salary_param", method = RequestMethod.POST)
    @ResponseBody
    public void addCustomer(@RequestParam("name_param") String nameParam) {
        param = nameParam;
        System.out.println(nameParam);
    }
    @RequestMapping(value = "/MySalary/salary_name", method = RequestMethod.POST)
    @ResponseBody
    public void addNewCustomer(
            @RequestParam("fNameParam") String fNameParam,
            @RequestParam("lNameParam") String lNameParam,
            @RequestParam("salParam") int salParam) {
        System.out.println(fNameParam + lNameParam + salParam);
        consService.addContact(fNameParam,lNameParam,salParam);
//        ManageEmployee ME = new ManageEmployee();
//        ME.addEmployee("Zara", "Ali", 1000);
    }

}