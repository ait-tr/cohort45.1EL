package classwork2904.example01;

public class OrderDetails {
    private Product product;
    private int amount;
    private double subtotal;

    public OrderDetails(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        subtotal = product.getPrice() * amount;
    }

    public void setProduct(Product product) {
        this.product = product;
        subtotal = product.getPrice() * amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        subtotal = product.getPrice() * amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
