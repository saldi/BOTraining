package com.bosch.test;

import org.apache.commons.math3.random.RandomDataGenerator;

public class MathMain {

  public static void main(String[] args) {

    System.out.println(new RandomDataGenerator().nextHexString(100));

  }


}
