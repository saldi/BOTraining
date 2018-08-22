package com.bosch.exception;

public class ExceptionMain {

  public static void main(String[] args) {

    DataProvider dataProvider = new DataProvider();

    try {
      dataProvider.getDataWithRuntimeException();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Integer data = dataProvider.getDataWithCheckedException();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {

    }


  }


}
