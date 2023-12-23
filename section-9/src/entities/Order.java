package entities;

import java.util.Date;

public class Order {
  private Date date;
  private Product product;

  public Order(Product product) {
    this.product = product;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void showDesc() {
    System.out.println(product.name);
  }
}
