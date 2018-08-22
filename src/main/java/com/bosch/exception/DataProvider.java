package com.bosch.exception;

public class DataProvider {

  public Integer getDataWithCheckedBBException() throws DataNotFoundException {
    //throw new DataNotFoundException();
    return new Integer(5);
  }


  public Integer getDataWithRuntimeException() {
    throw new RuntimeDataNotFoundException();
  }

}
