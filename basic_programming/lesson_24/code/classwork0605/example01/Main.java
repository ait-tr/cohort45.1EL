package classwork0605.example01;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(123, "Tomato", 3.50);
        Product product2 = new Product(123, "Tomato", 3.50);
        System.out.println(product); // toString вызывается автоматически

        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product.equals(product2));

        System.out.println("Reference: " + product.equals(product));
        System.out.println("Type: " + product.equals("Hello"));
        System.out.println("Values: " + product.equals(new Product(1, "Potato", 2.0)));
    }
}
