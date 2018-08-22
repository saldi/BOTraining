package com.bosch.test.animal;

public class Animal {

  int age;

  float weight;

  TypeOfAnimal type;

  @Override
  public String toString() {
    return "Animal{" +
        "age=" + age +
        ", weight=" + weight +
        ", type=" + type +
        '}';
  }
}
