package entities;

public class Product {
  String name;
  private double price;
  private int qty;

  public Product() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double totalValue() {
    return this.price * this.qty;
  }

  public void showDescription() {
    System.out.println("Product " + this.name + " costs R$: " + this.price + "and has total of: " + this.qty);
    System.out.println("Total Price: R$ " + this.totalValue());
  }
}
