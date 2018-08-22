package com.bosch.oop;

import java.math.BigDecimal;

public class Main {


  public static void main(String[] args) {

    Article article = Article.of();

    article.setId("ARTICLE ID");
    article.setDescription("TO JEST PRODUKT");
    article.setPrice(new BigDecimal(10));

    System.out.println(ArticleCounter.getInstance().getCounter());

    Article article2 = Article.of("ID2", "OPIS 2", new BigDecimal(20));

    System.out.println(ArticleCounter.getInstance().getCounter());

    System.out.println(article);
    System.out.println(article2);



  }





}
