package org.application;

import org.application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
  private EmployeeRepository employeeRepository;

  @Autowired
  public void setEmployeeRepository(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @GetMapping("/employees")
  public String listEmployees(Model model) {
    model.addAttribute("employees", employeeRepository.findAll());
    return "employees";
  }
}
