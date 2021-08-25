package com.raimbek.spring.mvcHybernateAop.controller;

import com.raimbek.spring.mvcHybernateAop.dao.EmployeeDAO;
import com.raimbek.spring.mvcHybernateAop.entity.Employee;
import com.raimbek.spring.mvcHybernateAop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FirstController {
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List <Employee> employeeList=employeeService.getAllEmployees();
        model.addAttribute("emlpList",employeeList);
        return "all-employees";
    }
    @RequestMapping("/imployeeInfo")
    public  String addNewEmployee(Model model){
        Employee employee= new Employee();
        model.addAttribute("employee",employee);

        return "employee-info";
    }
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveService(employee);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id,Model model){

        Employee employee= employeeService.getEmployeeByID(id);
        model.addAttribute("employee",employee);

        return "employee-info";
    }
    @RequestMapping("/deleteInfo")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return  "redirect:/";
    }


}
