package com.bosch.oop;

public class AnimalVisitor {

  public void visit(Cat cat) {
    cat.bringMouse();
  }

  public void visit(Dog dog) {
    dog.bringStick();
  }

  public void visit(Animal animal) {
    System.out.println("To jest ANIMAL");
  }

}
