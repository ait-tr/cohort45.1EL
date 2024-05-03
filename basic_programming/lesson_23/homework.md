
```
Ваш коллега начал работу над этим заданием, но заболел, и не может продолжить разработку. 
Завершите его работу. Наработки коллеги можно найти под заданием в Дополнении 1 (их нужно 
обязательно использовать, и лучше ничего не менять).

ТЗ:
Разработать классы Человек, Покупатель, Продавец и Продукт.
В классе Человек должно быть поле "имя" и метод "представиться", который будет выводить 
приветствие и имя человека.

В классе Продукт добавить поля наименование, количество и цена.

В классе покупателя добавить поле "количество денег" и методы:
1 "начать покупку" - принимает объект продавца, название товара и количество товара которое 
нужно купить (все остальные методы можно вызвать внутри этого)
2 "отдать деньги за покупку", принимает количество денег которое нужно заплатить, 
возвращает true если покупатель успешно оплатил покупку (деньги должны отниматься со счета при успешной оплате),
и false если у покупателя не хватает денег 

В классе продавца создать массив из Продуктов с размером 10.
Заполнить этот массив значениями из головы в конструкторе продавца либо в Main.
Разработать методы:
1 "огласить цену" - принимает наименование продукта и его количество, и возвращает цену 
этого продукта или -1 если такого продукта нет либо нет соответствующего количества на складе
Подсказка: линейный поиск
2 "продать продукт" - принимает наименование продукта и количество, отнимает данный
продукт со склада (из массива)

Применить инкапсуляцию. Применить наследование, где уместно.
В методе main класса Main продемонстрировать как будет проходить полный процесс покупки.

```

Дополнение 1:
```java
public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product() {
        this("", 0, 0);
    }

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    public boolean takeAmount(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }
}
```

```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

```java
public class Customer extends Person {
    
    private double money;
    
    public Customer(String name, double money) {
        super(name);
        this.money = money;
    }
    
    
    public void buyProduct(Seller seller, String productName, int amount) {
        double price = seller.getPrice(productName, amount);
        //TODO: finish rest of transaction in this method
        
    }
}
```