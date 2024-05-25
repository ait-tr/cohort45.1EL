## Comparable, Comparator

### Зачем сравнивать объекты?
Сравнение объектов необходимо для того, чтобы мы могли организовать их в определенном порядке, что полезно для сортировки и поиска.

## Интерфейс Comparable
`Comparable` - это интерфейс, который должен реализовать объект для того, чтобы его можно было сравнивать с другими объектами того же типа.

```
public interface Comparable<T> {
    int compareTo(T o);
}
```

#### Использование Comparable в сортировках

Классы, реализующие интерфейс `Comparable`, должны реализовать метод `compareTo()`, который сравнивает объект с другим объектом того же типа.

```
public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
```

#### Пример сортировки объектов с использованием Comparable
Давайте рассмотрим пример сортировки массива объектов класса `Person`:

```
Person[] persons = {
    new Person("Alice", 30),
    new Person("Bob", 25),
    new Person("Charlie", 35)
};

Arrays.sort(persons);
```

## Интерфейс Comparator

`Comparator` - это интерфейс, который определяет метод `compare()` для сравнения двух объектов.

```
public interface Comparator<T> {
    int compare(T o1, T o2);
}
```

### Использование Comparator в сортировках
Создадим собственный компаратор для класса `Person`, который будет сравнивать объекты по имени:

```
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
```

### Реализация собственного Comparator

#### Пример сравнения пользовательских объектов
Создадим собственный компаратор для сортировки объектов класса `Person` по убыванию возраста:

```
public class AgeDescComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.age, o1.age);
    }
}
```

#### Пример использования созданного компаратора для сортировки массива объектов `Person`:

```
Arrays.sort(persons, new AgeDescComparator());
```

## Анонимные классы

**Анонимный класс** в Java — это класс, который используется для создания объекта на лету, без явного объявления нового класса. Анонимные классы часто используются для реализации интерфейсов или расширения классов.
Анонимные классы часто используются, когда необходим одноразовый объект, и нет необходимости создавать отдельный именованный класс.


## Comparator как функциональный интерфейс
## Введение в функциональные интерфейсы

**Функциональные интерфейсы** - это особый тип интерфейсов в Java, которые имеют ровно один абстрактный метод. Они предоставляют абстрактное описание функции, которую можно реализовать в классе. В Java функциональные интерфейсы играют важную роль в контексте лямбда-выражений и функционального программирования.

- **Один абстрактный метод:**
  Главная особенность функциональных интерфейсов - наличие только одного абстрактного метода. Остальные методы могут быть как абстрактными, так и дефолтными или статическими, но их наличие не нарушает правило.


### Функциональный интерфейс Comparator
С Java 8 `Comparator` стал функциональным интерфейсом, что позволяет использовать лямбда-выражения для его реализации.

С Java 8 интерфейс `Comparator` был изменен для того, чтобы стать функциональным интерфейсом. Это означает, что теперь он имеет только один абстрактный метод `compare(T o1, T o2)`. Ранее `Comparator` содержал также методы для сравнения с null и для создания компараторов с различными сортировками, но все они стали методами по умолчанию (default methods), чтобы интерфейс оставался функциональным.

С изменением в Java 8, интерфейс `Comparator` теперь имеет только один абстрактный метод `compare(T o1, T o2)`, который принимает два объекта и возвращает целое число, указывающее на их отношение.


## Лямбда-выражения и Comparator


### Введение в лямбда-выражения:
- **Лямбда-выражения** - это способ краткой записи анонимных функций в Java.
- В лямбда-выражениях используется более компактный синтаксис для определения функций. Он включает параметры, стрелку **(->)** и тело функции.
- Лямбда-выражения были введены в Java 8 и являются одним из ключевых элементов функционального программирования в языке.

```
(parameters) -> expression
```

или

```
(parameters) -> { statements; }
```

Лямбда-выражения во многих случаях могут **заменить анонимные классы**, делая код более кратким и читаемым.

### Использование лямбда-выражений для создания компараторов:
- Лямбда-выражения могут упростить создание компараторов для сортировки объектов в Java.
- Вместо традиционного создания экземпляров анонимных классов компараторов, вы можете использовать лямбда-выражения для определения функции сравнения в одной строке.
- Лямбда-выражения позволяют передать компактные и читаемые правила сравнения объектов.


Пример использования лямбда-выражения для создания компаратора:

```
Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.age, p2.age);
Arrays.sort(persons, ageComparator);
```
Таким образом, мы можем создать компараторы на лету, что делает код более лаконичным и читаемым.


### Роль в лямбда-выражениях:
**Функциональные интерфейсы** предоставляют возможность создавать объекты, которые представляют собой реализацию одного абстрактного метода. Эти объекты могут быть переданы как аргументы методов, возвращены из методов, или использованы для создания лямбда-выражений.

### Роль в функциональном программировании:
Функциональные интерфейсы являются основой функционального программирования в Java. Они позволяют писать компактный и выразительный код с использованием лямбда-выражений, а также облегчают параллельное и асинхронное программирование.

___


## Обобщения (Generics)
Дженерики (обобщения) — это особые средства языка Java для реализации обобщённого программирования: особого подхода к описанию данных и алгоритмов, позволяющего работать с различными типами данных без изменения их описания.
На сайте Oracle дженерикам посвящён отдельный tutorial: [Oracle](https://docs.oracle.com/javase/tutorial/java/generics/index.html "Generics tutorial")

Обобщения или generics (обобщенные типы и методы) позволяют нам уйти от жесткого определения используемых типов.

Дженерики позволяют создавать классы, интерфейсы и методы, работающие с разными типами данных.

- Обобщенные классы.
  Пример: class Box<T> { private T content; ... }
- Обобщенные интерфейсы.
  Пример: interface List<T> { void add(T item); T get(int index); }
- Обобщенные методы.
```
    public <T> void printArray(T[] array) {
    for (T item : array) {
    System.out.println(item);
    }
    }
```

- Параметризация типами

```
public class GenericBox<T> {}
...
GenericBox<Integer> integerBox = new GenericBox<>;

```

При создании объекта класса после имени класса в угловых скобках нужно указать, какой именно тип будет использоваться вместо универсального параметра.
При этом надо учитывать, что они **работают только с объектами**, но не работают с примитивными типами.
То есть мы можем написать <Integer>, но не можем использовать тип int или double.
Вместо примитивных типов надо использовать классы-обертки: Integer вместо int, Double вместо double и т.д.


### Ограничения дженериков:

- Использование extends для ограничения типов.
  Пример: `class NumericBox<T extends Number> { ... }`

- Использование super для ограничения типов.
  Применяется в основном с `wildcards`.
  Wildcards: ?, `? extends T`, `? super T`.

Пример:
```
void processBoxes(List<? extends Fruit> boxes) { ... }
```

### Особенности работы с дженериками

- Erasure типов: что происходит во время компиляции.
  Во время выполнения информация о типах удаляется, и `List<Integer>` становится просто `List`.

- Невозможность создания экземпляров обобщенного типа.
  Пример: T item = new T(); // Ошибка

### Преимущества и недостатки использования дженериков.
- Преимущества: безопасность типов, переиспользование кода, улучшенная читаемость кода.
- Недостатки: сложность, ограничения на использование с примитивами, сложности при работе с массивами обобщенных типов.

<hr>

## Wrappers

Классы-обертки в Java используются для представления примитивных типов данных как объектов. Примитивные типы данных в Java, такие как `int`, `char` и `double`, не являются объектами. Однако иногда требуется работать с примитивами как с объектами, например, при добавлении их в коллекции или при использовании методов, ожидающих объекты.

Вот список классов-оберток для примитивных типов:

1. `Byte` - обертка для `byte`
2. `Short` - обертка для `short`
3. `Integer` - обертка для `int`
4. `Long` - обертка для `long`
5. `Float` - обертка для `float`
6. `Double` - обертка для `double`
7. `Character` - обертка для `char`
8. `Boolean` - обертка для `boolean`

Основные причины использования классов-оберток:

1. **Добавление в коллекции**: Примитивы напрямую не могут быть добавлены в коллекции, такие как `ArrayList`. С помощью классов-оберток их можно добавить как объекты.

2. **Методы и константы**: Классы-обертки предоставляют ряд полезных методов и констант для работы с соответствующими примитивами. Например, `Integer` предоставляет метод `parseInt` для преобразования строки в целое число.

3. **Поддержка `null`**: Примитивные типы не могут принимать значение `null`, в то время как их обертки могут. Это может быть полезно в некоторых случаях, чтобы отличить "отсутствующее" значение от любого конкретного значения примитива.

4. **Приведение типов**: Автоупаковка и автораспаковка в Java позволяют автоматически конвертировать примитивы в их обертки и наоборот.

Пример автоупаковки и автораспаковки:

```
Integer wrappedInt = 5;  // автоупаковка
int primitiveInt = wrappedInt;  // автораспаковка
```

Однако следует быть осторожным при работе с классами-обертками из-за возможных проблем с производительностью и неожиданным поведением, связанным с автоупаковкой и автораспаковкой.



Особенности работы с классами-обертками, связанные с автоупаковкой и автораспаковкой, могут проявляться в следующих условиях:

1. **Сравнение объектов с использованием `==`**: При использовании оператора `==` для сравнения двух объектов классов-оберток, сравниваются их ссылки, а не их значения. Это может привести к неожиданным результатам, особенно когда используется автоупаковка.

   ```
   Integer a = 127;
   Integer b = 127;
   System.out.println(a == b); // true

   Integer c = 128;
   Integer d = 128;
   System.out.println(c == d); // false
   ```

   В приведенном выше примере для значений от -128 до 127 используются кешированные объекты, поэтому `a` и `b` ссылаются на один и тот же объект. Однако для значений вне этого диапазона создаются новые объекты, и `c` и `d` являются разными объектами.

2. **Производительность**: Автоупаковка и автораспаковка добавляют накладные расходы, так как каждый раз создается новый объект. В циклах или интенсивных вычислениях это может существенно снизить производительность.

Общие (или схожие) методы, которыми обладают классы-обертки:

1. **`valueOf()`**: Преобразует данный тип (обычно строку или примитив) в соответствующий объект класса-обертки.

2. **`parseXxx()`**: Преобразует строку в соответствующий примитивный тип. Например, `Integer.parseInt()` или `Double.parseDouble()`.

3. **`toString()`**: Возвращает строковое представление значения объекта.

4. **`equals(Object obj)`**: Сравнивает текущий объект с указанным объектом на равенство.

5. **`compareTo()`**: Сравнивает текущий объект с другим объектом того же типа.

6. **`XxxValue()`**: Возвращает значение объекта как примитивный тип. Например, `intValue()` для `Integer` или `doubleValue()` для `Double`.

Это общие методы, но стоит отметить, что у каждого класса-обертки могут быть и свои уникальные методы, связанные с особенностями данного примитивного типа.
Все числовые обертки над примитивами в Java наследуются от абстрактного класса `Number`. Это включает в себя следующие классы:

- `Byte`
- `Short`
- `Integer`
- `Long`
- `Float`
- `Double`

Эти классы обладают методами, унаследованными от `Number`, которые позволяют извлекать значение объекта в различных примитивных форматах. К таким методам относятся:

- `byteValue()`
- `shortValue()`
- `intValue()`
- `longValue()`
- `floatValue()`
- `doubleValue()`

Таким образом, вы можете создать объект, например, `Integer`, и затем извлечь его значение в любом другом примитивном числовом формате с помощью соответствующего метода.

___

## Java Collections Framework
**Java Collections Framework** (JCF) - это архитектура в Java, которая предоставляет структуры данных и алгоритмы для работы с коллекциями. JCF входит в состав Java Standard Edition и содержит набор интерфейсов и их реализаций, которые облегчают разработку программного обеспечения, работающего с группами объектов.

**Коллекция** в Java (и в программировании в целом) - это объект, который группирует множество элементов в одном контейнере. В Java коллекции используются для хранения, управления, получения  и обработки данных в виде группы объектов.

Коллекции облегчают организацию данных и манипулирование ими, предоставляя структурированный и удобный способ работы с группами объектов.

Все коллекции в Java являются параметризованными, что означает, что они могут работать с элементами любого ссылочного типа данных. Параметризация коллекций позволяет задать конкретный тип данных, с которым будет работать коллекция, что обеспечивает типобезопасность и избавляет от необходимости приведения типов при извлечении элементов из коллекции.

```
List<String> strings = new ArrayList<>();  // коллекция для строк
List<Integer> integers = new LinkedList<>();  // коллекция для целых чисел
```

В этом примере `strings` может содержать только строки, а `integers` - только целые числа. Если попытаться добавить элемент другого типа, то компилятор выдаст ошибку.

Java Collections Framework (JCF) предоставляет несколько видов коллекций, каждый из которых имеет свои особенности:

- **Списки (List)**: упорядоченные коллекции, которые поддерживают дубликаты и обеспечивают доступ к элементам по индексу.
- **Множества (Set)**: неупорядоченные коллекции, не поддерживающие дубликаты.
- **Очереди (Queue)**: коллекции, обеспечивающие упорядоченное хранение элементов в порядке их добавления.
- **Карты (Map)**: коллекции, хранящие данные в виде пар "ключ-значение".

Таким образом, коллекция в Java - это структура данных, которая позволяет группировать объекты и работать с ними как с единой сущностью.

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_37/img/CollectionSB.jpeg" width="100%">


### Основные интерфейсы и их реализации в JCF:

#### Интерфейсы:
    - `Collection`: базовый интерфейс для всех коллекций.
    - `List`: интерфейс для упорядоченных коллекций, поддерживающих дубликаты. Реализации: `ArrayList`, `LinkedList`, `Vector`.
    - `Set`: интерфейс для наборов уникальных элементов. Реализации: `HashSet`, `LinkedHashSet`, `TreeSet`.
    - `SortedSet`: интерфейс для сортированных наборов.
    - `Queue`: интерфейс для очередей. Реализации: `LinkedList`, `PriorityQueue`.
    - `Deque`: интерфейс для двусторонних очередей. Реализации: `LinkedList`, `ArrayDeque`.
    - `Map`: интерфейс для коллекций пар "ключ-значение". Реализации: `HashMap`, `LinkedHashMap`, `TreeMap`.
    - `SortedMap`: интерфейс для сортированных карт.

#### Реализации:
    - `ArrayList` - базируется на массиве, обеспечивает быстрый доступ по индексу.
    - `LinkedList` - базируется на двусвязном списке, обеспечивает быстрое добавление/удаление элементов.
    - `Vector` - аналогичен `ArrayList`, но синхронизирован.
    - `HashSet` - обеспечивает быстрый доступ к элементам, порядок следования не гарантирован.
    - `LinkedHashSet` - сохраняет порядок добавления элементов.
    - `TreeSet` - хранит элементы в отсортированном порядке.
    - `PriorityQueue` - организует элементы в порядке приоритета.
    - `ArrayDeque` - быстрое добавление/удаление элементов с обеих сторон очереди.
    - `HashMap` - быстрый доступ к элементам, порядок следования не гарантирован.
    - `LinkedHashMap` - сохраняет порядок добавления элементов.
    - `TreeMap` - хранит элементы в отсортированном порядке.

#### Алгоритмы:
    - JCF предоставляет стандартные алгоритмы для сортировки, поиска и перестановки элементов коллекций.
      Класс `Collections`, который предоставляет статические методы для работы с коллекциями. Эти методы включают алгоритмы сортировки, поиска и перестановки элементов. Вот несколько примеров:


#### Синхронизация и неизменяемость:
    - Для поддержки многопоточных операций в JCF есть синхронизированные обертки для коллекций и методы для создания неизменяемых коллекций.
      Большинство реализаций коллекций в Java Collections Framework не являются потокобезопасными, то есть не гарантируют корректное поведение при использовании из нескольких потоков одновременно. Однако для обеспечения потокобезопасности, в Java есть специальные методы, которые позволяют создавать синхронизированные обертки над коллекциями.

Примеры создания синхронизированных коллекций:

```
List<String> list = Collections.synchronizedList(new ArrayList<String>());
Set<String> set = Collections.synchronizedSet(new HashSet<String>());
Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
```

Что касается неизменяемости, то в Java есть методы, которые позволяют создать неизменяемые (immutable) коллекции. Это означает, что после создания такой коллекции, ее содержимое не может быть изменено. Пример создания неизменяемого списка:

```
List<String> list = Collections.unmodifiableList(new ArrayList<String>(Arrays.asList("a", "b", "c")));
```
Попытка добавить или удалить элемент из неизменяемой коллекции приведет к выбросу исключения `UnsupportedOperationException`.


Выбор конкретной реализации коллекции в JCF зависит от требований к производительности, порядку элементов и других факторов, специфичных для конкретной задачи.


### Итераторы

Итераторы играют ключевую роль в JCF, предоставляя способ обхода элементов коллекции. Интерфейс `Iterator` позволяет проходить по коллекции, не раскрывая её внутреннее представление. Расширенный интерфейс `ListIterator` добавляет возможность итерации в обоих направлениях и возможность модифицировать элементы при обходе.

### Конкурентные коллекции

Для многопоточных приложений важным дополнением к JCF являются конкурентные коллекции, находящиеся в пакете `java.util.concurrent`. Эти коллекции, такие как `ConcurrentHashMap`, `CopyOnWriteArrayList` и `BlockingQueue`, разработаны для использования в многопоточном контексте и помогают избежать проблем с синхронизацией и блокировками.

### Производительность

Выбор конкретной реализации коллекции может зависеть от требований к производительности. Например, `ArrayList` предпочтительнее, если часто нужен быстрый доступ по индексу, а `LinkedList` - если требуется частая вставка и удаление элементов.

### Синхронизация

Несмотря на то, что некоторые старые коллекции, такие как `Vector` и `Stack`, являются синхронизированными, для современных многопоточных приложений рекомендуется использовать конкурентные коллекции из пакета `java.util.concurrent`. Для обычных коллекций также можно использовать обёртки из классов `Collections.synchronizedList`, `Collections.synchronizedSet` и т.д., чтобы добавить базовую синхронизацию.


### Заключение

Java Collections Framework обеспечивает мощные инструменты для работы с данными в коллекциях, способствуя написанию более чистого, эффективного и масштабируемого кода. Благодаря широкому спектру реализаций, JCF может удовлетворить различные потребности в разработке программного обеспечения на Java.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Anonymous Classes

An **anonymous class** in Java is a class that is used to create an object on-the-fly, without explicitly declaring a new class. Anonymous classes are often used for implementing interfaces or extending classes.

## Comparator as a Functional Interface
## Introduction to Functional Interfaces

**Functional interfaces** are a special type of interface in Java that have exactly one abstract method. They provide an abstract description of a function that can be implemented in a class. In Java, functional interfaces play a crucial role in the context of lambda expressions and functional programming.

- **One abstract method:**
  The main feature of functional interfaces is the presence of only one abstract method. Other methods can be either abstract, default, or static, but their presence doesn't violate the rule.

### Functional Interface Comparator
With Java 8, the `Comparator` became a functional interface, allowing the use of lambda expressions for its implementation.

From Java 8, the `Comparator` interface was modified to become a functional interface. This means it now has only one abstract method `compare(T o1, T o2)`. Previously, `Comparator` also had methods for comparing with null and for creating comparators with different sortings, but they all became default methods so that the interface remained functional.

With the change in Java 8, the `Comparator` interface now has only one abstract method `compare(T o1, T o2)`, which takes two objects and returns an integer indicating their relation.

## Lambda Expressions and Comparator

### Introduction to Lambda Expressions:
- **Lambda expressions** are a way to briefly record anonymous functions in Java.
- Lambda expressions use a more compact syntax to define functions. It includes parameters, an arrow **(->)**, and a function body.
- Lambda expressions were introduced in Java 8 and are one of the key elements of functional programming in the language.

```
(parameters) -> expression
```

or

```
(parameters) -> { statements; }
```

### Using Lambda Expressions to Create Comparators:
- Lambda expressions can simplify the creation of comparators for sorting objects in Java.
- Instead of traditionally creating instances of anonymous class comparators, you can use lambda expressions to define a comparison function in one line.
- Lambda expressions allow you to pass compact and readable object comparison rules.

Example of using a lambda expression to create a comparator:

```
Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.age, p2.age);
Arrays.sort(persons, ageComparator);
```
Thus, we can create comparators on-the-fly, making the code more concise and readable.

### Role in Lambda Expressions:
**Functional interfaces** provide the ability to create objects that represent the implementation of one abstract method. These objects can be passed as method arguments, returned from methods, or used to create lambda expressions.

### Role in Functional Programming:
Functional interfaces are the foundation of functional programming in Java. They allow for writing compact and expressive code using lambda expressions, as well as facilitating parallel and asynchronous programming.


___

## Generics

Generics, also known as templates in some programming languages, are a feature in Java that allow you to write classes, interfaces, and methods that operate on types as parameters. They enable you to create more flexible and reusable code by abstracting data types.

In Java, generics provide the ability to work with different types of data without specifying those types when defining the class or method. This makes your code more generic and adaptable to different data types.

Oracle has a dedicated tutorial on generics, which you can find [here](https://docs.oracle.com/javase/tutorial/java/generics/index.html).

Generics help improve code reusability and type safety, allowing you to write more flexible and robust Java programs.


```
public class GenericBox<T> {}
...
GenericBox<Integer> gBox1 = new GenericBox<>;

```

### Using Generics

When creating an object of a generic class, you need to specify the actual type that will be used in place of the generic parameter. This allows you to work with different types in a type-safe manner while reusing the same code structure.

However, it's important to note that generics in Java work only with objects and cannot be used with primitive data types. For instance, you can write `<Integer>` to work with `Integer` objects, but you cannot use generics with primitive types like `int` or `double`. In such cases, you should use wrapper classes like `Integer` instead of `int` and `Double` instead of `double`.

Generics provide a powerful way to create reusable code that can work with various data types while maintaining type safety.

<hr>


## Wrappers

Wrapper classes in Java are used to represent primitive data types as objects. Primitive data types in Java, such as `int`, `char`, and `double`, are not objects. However, there are times when you need to treat primitives as objects, for instance when adding them to collections or when using methods that expect objects.

Here's a list of wrapper classes for primitive types:

1. `Byte` - wrapper for `byte`
2. `Short` - wrapper for `short`
3. `Integer` - wrapper for `int`
4. `Long` - wrapper for `long`
5. `Float` - wrapper for `float`
6. `Double` - wrapper for `double`
7. `Character` - wrapper for `char`
8. `Boolean` - wrapper for `boolean`

Main reasons for using wrapper classes:

1. **Adding to Collections**: Primitives can't be added directly to collections, like `ArrayList`. With wrapper classes, they can be added as objects.

2. **Methods and Constants**: Wrapper classes offer a range of useful methods and constants to work with their respective primitives. For instance, `Integer` offers the `parseInt` method to convert a string into an integer.

3. **Support for `null`**: Primitive types can't take a `null` value, while their wrappers can. This can be helpful in certain scenarios to distinguish a "missing" value from any specific primitive value.

4. **Type Casting**: Autoboxing and unboxing in Java allows primitives to be automatically converted to their wrappers and vice versa.

Example of autoboxing and unboxing:

```
Integer wrappedInt = 5;  // autoboxing
int primitiveInt = wrappedInt;  // unboxing
```

However, care should be taken when working with wrapper classes due to possible performance issues and unexpected behavior related to autoboxing and unboxing.

Particularities of working with wrapper classes related to autoboxing and unboxing can manifest under the following conditions:

1. **Object comparison using `==`**: When using the `==` operator to compare two wrapper class objects, their references are compared, not their values. This can lead to unexpected results, especially when autoboxing is involved.

   ```
   Integer a = 127;
   Integer b = 127;
   System.out.println(a == b); // true

   Integer c = 128;
   Integer d = 128;
   System.out.println(c == d); // false
   ```

In the example above, for values from -128 to 127, cached objects are used, so `a` and `b` refer to the same object. However, for values outside this range, new objects are created, and `c` and `d` are different objects.

Here's the translation:

2. **Performance**: Autoboxing and unboxing introduce overhead since a new object is created every time. In loops or intensive computations, this can significantly degrade performance.

Common (or similar) methods that wrapper classes possess:

1. **`valueOf()`**: Converts the given type (usually a string or primitive) into the corresponding wrapper class object.

2. **`parseXxx()`**: Converts a string into the corresponding primitive type. For instance, `Integer.parseInt()` or `Double.parseDouble()`.

3. **`toString()`**: Returns the string representation of the object's value.

4. **`equals(Object obj)`**: Compares the current object with the specified object for equality.

5. **`compareTo()`**: Compares the current object with another object of the same type.

6. **`XxxValue()`**: Returns the object's value as a primitive type. For instance, `intValue()` for `Integer` or `doubleValue()` for `Double`.

These are general methods, but it's worth noting that each wrapper class may also have its own unique methods related to the specifics of its primitive type.
All numeric wrappers over primitives in Java inherit from the abstract class `Number`. This includes the following classes:

- `Byte`
- `Short`
- `Integer`
- `Long`
- `Float`
- `Double`

These classes possess methods inherited from `Number` that allow extracting the object's value in various primitive formats. Such methods include:

- `byteValue()`
- `shortValue()`
- `intValue()`
- `longValue()`
- `floatValue()`
- `doubleValue()`

Thus, you can create an object, for instance, `Integer`, and then extract its value in any other primitive numeric format using the respective method.


</details>