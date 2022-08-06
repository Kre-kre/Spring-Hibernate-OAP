package com.spring.controller;

import com.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.entity.Employee;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmp(Model model) {
        List<Employee> allEmps = employeeService.getAllEmployee()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getId))
                .collect(Collectors.toList());
        model.addAttribute("allEmp", allEmps);

        return "all-emps";

    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") Long id, Model model) {

        Employee employee = employeeService.getEmployee(id);

        model.addAttribute("employee", employee);

        return "info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
