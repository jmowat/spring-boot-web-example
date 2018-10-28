package org.application;

import org.application.model.Employee;
import org.application.model.User;
import org.application.repository.EmployeeRepository;
import org.application.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
  private Logger LOG = LoggerFactory.getLogger(this.getClass().getName());
  private final UserRepository userRepository;
  private final EmployeeRepository employeeRepository;

  @Autowired
  public MainApplication(UserRepository userRepository, EmployeeRepository employeeRepository) {
    this.userRepository = userRepository;
    this.employeeRepository = employeeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class, args);
  }

  @Override

  public void run(String... args) throws Exception {
    User user1 = new User(1L, "Sergey", 24);
    User user2 = new User(2L, "Ivan", 26);
    User user3 = new User(3L, "Adam", 31);
    LOG.info("Inserting user data in DB.");
    userRepository.save(user1);
    userRepository.save(user2);
    userRepository.save(user3);
    LOG.info("User count in DB: {}", userRepository.count());
    LOG.info("User with ID 1: {}", userRepository.findById(1L));

    Employee emp1 =
        new Employee(1L, "John", "Smith", "12-12-1980", "Manager", "Sales", "john.smith@abc.com");
    Employee emp2 =
        new Employee(2L, "Laura", "Adams", "02-11-1979", "Manager", "IT", "laura.adams@abc.com");
    Employee emp3 = new Employee(3L, "Peter", "Williams", "22-10-1966", "Coordinator", "HR",
        "peter.williams@abc.com");
    Employee emp4 = new Employee(4L, "Joana", "Sanders", "11-11-1976", "Manager", "Marketing",
        "joana.sanders@abc.com");
    Employee emp5 = new Employee(5L, "John", "Drake", "18-08-1988", "Coordinator", "Finance",
        "john.drake@abc.com");
    Employee emp6 = new Employee(6L, "Samuel", "Williams", "22-03-1985", "Coordinator", "Finance",
        "samuel.williams@abc.com");
    Employee emp7 = new Employee(7L, "Jason", "Mowat", "22-03-1975", "Team Lead", "IT",
        "jason.mowat@abc.com");
    LOG.info("Inserting employee data in DB.");
    employeeRepository.save(emp1);
    employeeRepository.save(emp2);
    employeeRepository.save(emp3);
    employeeRepository.save(emp4);
    employeeRepository.save(emp5);
    employeeRepository.save(emp6);
    employeeRepository.save(emp7);
    LOG.info("Employee count in DB: {}", employeeRepository.count());
    LOG.info("Employee with ID 2: {}", employeeRepository.findById(1L));
    LOG.info("Employees with last name of Williams: {}", employeeRepository.findByLastName("Williams"));
  }
}
