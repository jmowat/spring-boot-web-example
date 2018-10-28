package org.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  private Long id;
  private String name;
  private int age;

  public User() {}

  public User(Long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  // standard setters and getters
  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
  }
}
