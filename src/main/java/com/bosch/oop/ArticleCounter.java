package com.bosch.oop;

public class ArticleCounter {

  private static ArticleCounter articleCounter =
      new ArticleCounter();

  public static ArticleCounter getInstance() {
    return articleCounter;
  }

  private int counter = 0;

  private ArticleCounter() {

  }

  public int getCounter() {
    return counter;
  }

  public void incrementCounter() {
    counter++;
  }


}
