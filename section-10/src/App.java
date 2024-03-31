public class App {
    public static void main(String[] args) throws Exception {
        Product[] p = new Product[3];

        p[0] = new Product(20.90, "TV");
        p[1] = new Product(30.90, "Videogame");
        p[2] = new Product(10.90, "Freeze");

        for (int i = 0; i < p.length; i++) {
            System.out.println("Product " + p[i].getName() + " costs: " + p[i].getPrice());
        }
    }
}
