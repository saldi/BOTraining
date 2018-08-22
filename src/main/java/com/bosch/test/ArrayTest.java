package com.bosch.test;

public class ArrayTest {


  public static void main(String[] args) {

    int[] itbl = new int[10];

    printTable(itbl);
    System.out.println(itbl[5]);

    Integer[] Itbl = new Integer[10];
    printTable(Itbl);

    Itbl[5] = new Integer(10);

    if (Itbl[5] != null) {
      System.out.println(Itbl[5].doubleValue());
    }


  }

  public static void printTable(Integer[] tbl) {

    for (Integer i : tbl) {
      System.out.println(i);
    }

  }

  public static void printTable(int[] tbl) {

    tbl[5] = 10;

    tbl = new int[20];
    tbl[5] = 400;

    for (int i : tbl) {
      System.out.println(i);
    }

  }


}
