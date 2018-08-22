package com.bosch.oop;

import java.util.Objects;

public abstract class Animal implements Sleepable {

  private String name;

  private Integer age;

  public Animal(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public abstract void saySomething();

  public void goSleep() {
    System.out.println("SLEEP");
  }

  public void visit(AnimalVisitor visitor) {
    visitor.visit(this);
  }


  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Animal animal = (Animal) object;
    return Objects.equals(name, animal.name) &&
        Objects.equals(age, animal.age);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age);
  }
}
