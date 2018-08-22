package com.bosch.oop;

public class AnimalMain {


  public static void main(String[] args) {

    Animal cat = new Cat("Mruczek", 2);
    Animal dog = new Dog("Azorek", 4);

    cat.saySomething();
    cat.goSleep();
    dog.saySomething();
    dog.goSleep();

    makeFun(cat);
    makeFun(dog);

  }

  public static void makeFun(Animal animal) {
    animal.visit(new AnimalVisitor());
  }


}
