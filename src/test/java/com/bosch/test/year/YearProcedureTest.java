package com.bosch.test.year;

import static org.testng.Assert.*;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class YearProcedureTest {

  @Test
  public void testResolveValue() {

    YearProcedure yearProcedure = new YearProcedure(new YearProvider() {
      @Override
      public int getYear() {
        return 2018;
      }
    });
    int value = yearProcedure.resolveValue();

    Assertions.assertThat(value).isEqualTo(0);


  }
}