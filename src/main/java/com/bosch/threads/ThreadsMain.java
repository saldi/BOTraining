package com.bosch.threads;

import java.util.concurrent.TimeUnit;

public class ThreadsMain {

  public static void main(String[] args) throws InterruptedException {
    new ThreadsMain().start();
  }

  private Integer value = new Integer(0);

  synchronized void incrementValue() {
    Integer v = new Integer(value.intValue() + 1);
    value = v;
  }

  synchronized void decrementValue() {
    Integer v = new Integer(value.intValue() - 1);
    value = v;
  }


  void start() throws InterruptedException {
    Thread[] threads = new Thread[200];

    for (int i = 0; i < 100; i++) {
      threads[i] = new Thread(new IncrementRunnable());
    }
    for (int i = 100; i < 200; i++) {
      threads[i] = new Thread(new DecrementRunnable());
    }

    for (Thread t : threads) {
      t.start();
    }

    TimeUnit.SECONDS.sleep(5);
    System.out.println("Wartosc " + value);

  }


  class IncrementRunnable implements Runnable {

    @Override
    public void run() {
      incrementValue();
    }
  }

  class DecrementRunnable implements Runnable {

    @Override
    public void run() {
      decrementValue();
    }
  }

}
