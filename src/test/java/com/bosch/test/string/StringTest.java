package com.bosch.test.string;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class StringTest {

  @Test
  public void stringPoolTest() {

    String s1 = "Ala ma kota";
    String s2 = "Ala ma kota";
    String s3 = new String("Ala ma kota");

    new Assertion().assertTrue(s1 == s2);
    new Assertion().assertFalse(s1 == s3);
    new Assertion().assertTrue(s3.equals(s2));


  }

  @Test
  public void immutabilityTest() {

    String text = "Ala ma kota";
    String upperText = text.toUpperCase();
    new Assertion().assertFalse(text == upperText);

    String targetText = text + " " + upperText;
    System.out.println(targetText);
    System.out.println(text);
    System.out.println(upperText);

//    System.out.println(text.toUpperCase());

  }

  @Test
  public void stringBuilderTest() {

    long t1 = System.currentTimeMillis();
    String text = "";
    for (int i = 0; i < 80000; i++) {
      text += "Dodatkowy text";
    }
    long t2 = System.currentTimeMillis();

    System.out.println(t2 - t1);

    t1 = System.currentTimeMillis();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 80000; i++) {
      builder.append("Dodatkowy text");
    }
    t2 = System.currentTimeMillis();

    System.out.println(t2 - t1);
  }


}
