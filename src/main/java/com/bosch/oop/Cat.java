package com.bosch.oop;

public class Cat extends Animal {


  public Cat(String name, Integer age) {
    super(name, age);
  }

  public void bringMouse() {
    System.out.println("MASZ MYSZ");
  }

  public void saySomething() {
    System.out.println("MRAAAAAAAAUUUUUU MRRRAUUUUU");
  }

  @Override
  public void goSleep() {
    System.out.println("JAK BĘDĘ CHCIAL TO POJDE");
  }

  @Override
  public void visit(AnimalVisitor visitor) {
    visitor.visit(this);
  }


  @Override
  public String toString() {
    return "Cat{} " + super.toString();
  }
}
