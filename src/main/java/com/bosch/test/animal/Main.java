package com.bosch.test.animal;

public class Main {

  public static void main(String[] args) {

    Animal krowaCiociLusi = new Animal();
    krowaCiociLusi.age = 20;
    krowaCiociLusi.type = TypeOfAnimal.COUNTRY;
    krowaCiociLusi.weight = 300f;

    print(krowaCiociLusi);
  }

  public static void print(Animal animal) {

    switch (animal.type) {
      case COUNTRY:
        System.out.println("Wiejskie");
        System.out.println(animal);
        break;
      case HOUSE:
        System.out.println("Domowy");
        break;
      case GARDEN:
        System.out.println("Ogrodowy");
        break;
    }


  }


}
