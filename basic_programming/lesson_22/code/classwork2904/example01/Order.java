package classwork2904.example01;

public class Order {
    private MyArrayList orderList = new MyArrayList();

    // подсчитать общую сумму
    // добавлять/удалять продукты
    // Доп задание: Просмотреть заказ
    // Доп задание: метод для изменения количества продукта

    public int getAmountOfProducts() {
        return orderList.getSize();
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < orderList.getSize(); i++) {
            total += orderList.get(i).getSubtotal();
        }
        return total;
    }

    public void addProduct(Product product, int amount) {
        OrderDetails details = new OrderDetails(product, amount);
        orderList.add(details);
    }

    public void removeProduct(int id) {
        for (int i = 0; i < orderList.getSize(); i++) {
            if (orderList.get(i).getProduct().getId() == id) {
                orderList.remove(i);
                break;
            }
        }
    }
}
