package org.application.repository;

import java.util.List;
import org.application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
  List<Employee> findByLastName(String lastName);
}
