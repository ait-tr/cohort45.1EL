<details>
  <summary style="cursor: pointer;"><b>English</b></summary>



</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

## Анонимные классы
* Анонимный класс - такой класс, который не имеет отдельного файла и описывается для создания только одного объекта.
* Анонимным он называется потому что у него нет идентификатора.
* Анонимные классы могут создаваться только как наследники абстрактных классов, либо реализанты интерфейса.
* В анонимных классах можно писать все тоже самое что и в обычных. Только обратите внимание, что новые публичные методы нельзя
  будет вызвать (так как они не будут видимы).
* Несмотря на то что статические методы можно будет написать, в них нет смысла, так как вы их будете все равно вызывать из объекта.

```java
interface SomeInterface {
    void doSomething();
}

public class Main {
    public static void main(String[] args) {
        SomeInterface obj = new SomeInterface() {
            @Override
            public void doSomething() {
                helperMethod();
                // do something...
            }
            
            private void helperMethod() {
                // do some help
            }
        };
        
        obj.doSomething();
    }
}
```

## Collection framework
* Collection framework - это библиотека, которая идет вместе с джавой (out-of-the-box), которая позволяет создавать коллекции
и управлять ими.
* Коллекция (структура данных) - это способ хранения данных. Разные коллекции могут иметь абсолютно разные способы хранения
элементов, и разные способы доступа к ним.
* Все основные коллекции будут определены в интерфейсах:
  * List
  * Queue
  * Set
  * Map
  * Collection
* Обратите внимание - Comparator, Comparable, Iterator, Iterable тоже являются частью Collection framework
* Collection framework дает не только требования к коллекциям, но и их базовые реализации:
  * ArrayList - список на основе массива
  * LinkedList - связный список
  * HashSet - множество (хеш-таблица)
  * PriorityQueue - очередь
  * HashMap - карта значений
  * Stack - стак
</details>
