package org.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author luperalt
 */
@Entity
public class Employee {
  @Id
  private Long id;
  private String name;
  private String lastName;
  private String birthDate;
  private String role;
  private String department;
  private String email;

  public Employee() {}

  public Employee(Long id, String name, String lastName, String birthDate, String role,
      String department, String email) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.role = role;
    this.department = department;
    this.email = email;
  }

   public Long getId() {
   return id;
   }
  
   public void setId(Long id) {
   this.id = id;
   }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthDate="
        + birthDate + ", role=" + role + ", department=" + department + ", email=" + email + '}';
  }


}
