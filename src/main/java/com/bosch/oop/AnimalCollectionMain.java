package com.bosch.oop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnimalCollectionMain {


  public static void main(String[] args) {

    Set<Cat> cats = new HashSet<>();

    cats.add(new Cat("Mruczek", 4));
    cats.add(new Cat("Mruczek", 4));

    System.out.println(cats.size());

    Map<String, Dog> map = new HashMap<>();

    map.put("Azorek", new Dog("Azorek", 10));
    map.put("Reksio", new Dog("Reksio", 2));

    System.out.println(map.get("Azorek").toString());



  }


}
