package com.bosch.oop;

public class Dog extends Animal {

  public Dog(String name, Integer age) {
    super(name, age);
  }

  public void bringStick() {
    System.out.println("MASZ PATYK");
  }

  public void saySomething() {
    System.out.println("WOOF WOOF WOOF");
  }

  @Override
  public String toString() {
    return "Dog{} " + super.toString();
  }
}
