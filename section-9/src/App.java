import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        product.setName("Teste");
        product.setPrice(10.0);
        product.setQty(1);
        product.showDescription();
    }
}
