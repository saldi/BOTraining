package com.bosch.test.year;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class YearProcedure {

  private YearProvider yearProvider;

  public YearProcedure() {
    this.yearProvider = new CurrentYearProvider();
  }

  YearProcedure(YearProvider yearProvider) {
    this.yearProvider = yearProvider;
  }

  public int resolveValue() {
    int year = this.yearProvider.getYear();
    if (year == 2018) {
      return 0;
    } else if (year == 2017) {
      return 1;
    } else {
      return -1;
    }

  }

}

class CurrentYearProvider implements YearProvider {

  @Override
  public int getYear() {
    LocalDate now = LocalDate.now();
    return now.getYear();
  }
}