package com.bosch.oop;

import java.math.BigDecimal;

public class Article {

  private String id;

  private String description;

  private BigDecimal price;

//  {
//    ArticleCounter.getInstance().incrementCounter();
//  }

  private Article() {

  }

  private Article(String id, String description) {
    this.id = id;
    this.description = description;
    this.price = new BigDecimal(200);
  }

  private Article(String id, String description, BigDecimal price) {
    this.id = id;
    this.description = description;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Article{" +
        "id='" + id + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        '}';
  }


  public static Article of() {
    Article article = new Article();
    ArticleCounter.getInstance().incrementCounter();
    return article;
  }

  public static Article of(String id, String description, BigDecimal price) {
    Article article = new Article(id, description, price);
    ArticleCounter.getInstance().incrementCounter();
    return article;
  }


}
