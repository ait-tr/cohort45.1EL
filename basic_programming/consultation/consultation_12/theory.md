

С вероятностью 99,9% между классами в наших приложениях будут существовать некая связь

В ООП выделяют два вида связей между классами:
- IS-A является
- HAS-A имеет


```
Autobus IS-A Vehicle
Driver IS-A Person
Passenger IS-A Person
```

```
Autobus HAS-A RegistrationDoc
Autobus HAS-A Driver
Autobus HAS-A Passengers
```

В объектно-ориентированных языках программирования существует три способа организации взаимодействия между классами

- Наследование
- Агрегация
- Композиция

**Наследование** — это когда класс-наследник имеет все поля и методы родительского класса, и, как правило, добавляет какой-то новый функционал и/или поля. 
Наследование – это один из основных принципов объектно-ориентированного программирования, который позволяет создавать новый класс на основе существующего класса.
Наследование основывается на связи IS-A «является».

Наследование в коде программы обозначается ключевым словом `extends`.  

Также следует знать, что класс, от которого наследуются, называется родителем (родительским классом, класс-родитель). 
Класс, который наследует, соответственно класс-потомок.

```
public class Car extends Vehicle{

   private final int passengersCount;
   private int  mileage;

   public Car(String model, int year, int passengersCount) {
       super(model, year);
       this.passengersCount = passengersCount;
       this.mileage = 10000;
   }
```

Вынесение общих состояний и поведения (полей и методов) в класс-родитель позволит нам сэкономить кучу времени и места.

Если же у какого-то типа есть свойства или методы, уникальные только для него и отсутствующие у других типов машин, — не беда. 
Их всегда можно создать в классе-потомке, отдельно от всех остальных.

**Важно! В Java нет множественного наследования.**
**Каждый класс может наследоваться только от одного класса**

---

## Полиморфизм

Полиморфизм - одно из четырёх основных понятий объектно-ориентированного программирования (ООП) наряду с инкапсуляцией, наследованием и абстракцией. 
Это понятие происходит от греческих слов: "поли" (много) и "морф" (форма), и, действительно, **полиморфизм позволяет объектам принимать множество форм**.

А дальше, как говорится, "возможны варианты".
Существует множество определений для явления полиморфизма. Включая очень мудреные и не понятных, даже после 5го прочтения этого определения.

**Полиморфизм** — это концепция объектно-ориентированного программирования (ООП), которая позволяет рассматривать объекты разных классов как объекты общего класса. В Java полиморфизм означает, что метод может иметь несколько реализаций в зависимости от типа объекта, с которым выполняется операция.

**Полиморфизмом** называется возможность работать с несколькими типами так, как будто это один и тот же тип и в то же время поведение каждого типа будет уникальным в зависимости от его реализации.

**Полиморфизм** — одна из четырех фундаментальных концепций объектно-ориентированного программирования, которая позволяет выполнять определенную задачу(действие) несколькими способами.

Полиморфизм позволяет рассматривать объекты как объекты их базового класса, что позволяет писать общий код, делая его более гибким и пригодным для повторного использования. Это позволяет создавать более многоразовый и удобный в сопровождении код, а также повышает читаемость кода.



- **Статический полиморфизм (компиляционный)**: реализуется с помощью перегрузки методов. Компилятор определяет, какой метод нужно вызывать на основе объявления метода (имя метода и список параметров).

- **Динамический полиморфизм (времени выполнения)**: реализуется с помощью переопределения методов. Время выполнения (JVM) определяет, какой метод вызывать на основе фактического объекта, на котором вызывается метод.

"Динамический полиморфизм" (полиморфизм времени выполнения, который реализуется через переопределение методов) часто называется "истинным полиморфизмом". Это потому, что во время выполнения решение о том, какой метод вызвать, принимается на основе реального типа объекта, что и является ключевой особенностью полиморфизма в объектно-ориентированном программировании.

Да, полиморфизм - это точно про гибкость. Основной механизм в Java, делающий наш код гибким.

## Восходящее преобразование (upcasting), нисходящее преобразование (downcasting)

Т.к. класс содержит все методы класса, от которого он был унаследован, то объект этого класса можно сохранить в переменную любого из его типов родителей.

Если в результате присваивания мы двигаемся по цепочке наследования вверх (к типу Object), то это — расширение типа (оно же — восходящее преобразование или upcasting), а если вниз, к типу объекта, то это — сужение типа (оно же — нисходящее преобразование или down-casting).


## Класс Object

Класс `Object` в Java занимает особое место в иерархии классов языка программирования Java. 
Он является корнем иерархии классов в Java, что означает, что любой другой класс неявно наследуется от класса `Object`, если только не указано иное. 

Это обеспечивает базовую функциональность для всех объектов в Java и является основой для реализации _полиморфизма_.

### Наследование и Класс Object

Когда класс не расширяет явно другой класс, он неявно наследуется от класса `Object`. 
Это означает, что любой объект в Java наследует базовые методы класса `Object`, которые могут быть переопределены для изменения их поведения в подклассах. 
Наследование от `Object` обеспечивает общий тип для всех объектов и позволяет использовать любой объект в Java там, где ожидается `Object`.

### Полиморфизм и Класс Object

Полиморфизм в Java позволяет одной и той же переменной ссылочного типа указывать на объекты различных типов. Благодаря тому, что все классы наследуются от `Object`, переменную типа `Object` можно использовать для ссылки на любой объект независимо от его конкретного класса. Это позволяет, например, хранить в коллекциях объекты различных типов, поскольку все они являются наследниками класса `Object`.

### Основные Методы Класса Object

Класс `Object` предоставляет несколько методов, которые имеют большое значение для работы с объектами в Java:

- **`equals(Object obj)`**: Определяет, равен ли текущий объект другому объекту. Метод можно переопределить в подклассах для реализации сравнения объектов по значению.
- **`hashCode()`**: Возвращает хеш-код объекта, который используется в коллекциях, таких как `HashMap`. Переопределение этого метода важно при изменении поведения метода `equals`, чтобы поддерживать контракт между `equals` и `hashCode`.
- **`toString()`**: Возвращает строковое представление объекта. Часто переопределяется в подклассах для предоставления более информативного описания объекта.
- **`clone()`**: Создаёт и возвращает копию объекта. Чтобы использовать этот метод, класс должен реализовать интерфейс `Cloneable`.
- **`getClass()`**: Возвращает объект `Class`, который представляет класс выполнения объекта. Этот метод может быть использован для получения метаинформации о классе.
- **`finalize()`**: Вызывается сборщиком мусора перед удалением объекта. Этот метод может быть переопределён для реализации очистки ресурсов перед уничтожением объекта, но его использование не рекомендуется из-за непредсказуемости работы сборщика мусора.

Все методы в [документации](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html).


Наследование от класса `Object` в Java гарантирует, что методы, определённые в классе `Object`, доступны во всех классах, даже если эти классы являются пользовательскими или частью Java API. Это означает, что каждый объект в Java наследует базовый набор методов, который может быть использован для выполнения фундаментальных операций, таких как сравнение объектов, получение хеш-кода объекта, получение строкового представления объекта и других.

### Наследование и Универсальность Методов

Благодаря наследованию от класса `Object`, мы имеем уверенность в том, что любой объект в Java будет обладать определённым базовым поведением. Это делает объекты в Java взаимозаменяемыми в контекстах, где ожидается тип `Object`, и обеспечивает базовую функциональность для любого типа объектов.

### Полиморфизм и Переопределение Методов

Полиморфизм в Java позволяет классам переопределить (override) методы, унаследованные от класса `Object`, для предоставления специфичного для класса поведения. Например, переопределяя метод `equals()`, можно определить, когда два объекта считаются равными на основе их содержимого, а не идентичности ссылок. Аналогично, переопределение `toString()` позволяет возвращать строковое представление объекта, которое может быть более информативным и понятным для человека.

Переопределение методов класса `Object` обеспечивает два важных аспекта полиморфизма:
- **Время компиляции**: Компилятор Java позволяет переопределить методы, гарантируя, что подклассы могут предоставлять собственную реализацию для унаследованных методов.
- **Время выполнения**: Виртуальная машина Java (JVM) во время выполнения определяет, какая версия метода должна быть вызвана на основе фактического типа объекта, что позволяет одной и той же ссылке вызывать различные реализации методов в зависимости от типа объекта, на который она указывает.

### Заключение

Таким образом, наличие методов класса `Object` во всех классах Java и возможность их переопределения являются фундаментальными аспектами объектно-ориентированного программирования в Java. Это обеспечивает универсальность и гибкость при работе с объектами различных типов, позволяя разработчикам модифицировать или расширять базовое поведение объектов для соответствия специфическим требованиям их программ.


<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>


With a probability of 99.9%, there will be some relationship between classes in our applications.

In OOP, two types of relationships are distinguished between classes:
- IS-A relationship
- HAS-A relationship

```
Autobus IS-A Vehicle
Driver IS-A Person
Passenger IS-A Person
```

```
Autobus HAS-A RegistrationDoc
Autobus HAS-A Driver
Autobus HAS-A Passengers
```

In object-oriented programming languages, there are three ways to organize the interaction between classes:

- **Inheritance**
- **Aggregation**
- **Composition**

**Inheritance** is when a subclass inherits all fields and methods of the parent class and typically adds some new functionality and/or fields. Inheritance is based on the IS-A relationship.

Inheritance in code is indicated by the keyword `extends`. It's important to note that the class from which another class is inherited is called the parent (or superclass), and the class that inherits is called the child (or subclass).

```
public class Car extends Vehicle{

   private final int passengersCount;
   private int  mileage;

   public Car(String model, int year, int passengersCount) {
       super(model, year);
       this.passengersCount = passengersCount;
       this.mileage = 10000;
   }
```

Extracting common states and behaviors (fields and methods) into a parent class allows us to save a lot of time and space.

If a particular type has properties or methods unique to it and not present in other types of vehicles, that's not a problem. You can always create them in a child class, separate from all the others.

**Important! In Java, there is no multiple inheritance.**
**Each class can only inherit from one class.**

---


## Polymorphism

Polymorphism is one of the four main concepts of object-oriented programming (OOP) alongside encapsulation, inheritance, and abstraction. The term stems from Greek words: "poly" (many) and "morph" (form). Indeed, **polymorphism allows objects to take on many forms**.

From here, as they say, "there are variations".
There are many definitions for the phenomenon of polymorphism. Including some that are very intricate and still not understood even after reading them five times.

**Polymorphism** is a concept of object-oriented programming (OOP) that allows treating objects of different classes as objects of a common class. In Java, polymorphism means that a method can have multiple implementations depending on the type of the object with which the operation is performed.

**Polymorphism** is the ability to work with several types as if they were the same type, while at the same time, the behavior of each type will be unique depending on its implementation.

**Polymorphism** is one of the four fundamental concepts of object-oriented programming that allows accomplishing a particular code.task (action) in several ways.

Polymorphism enables treating objects as objects of their base class, allowing for the writing of general code, making it more flexible and reusable. It allows for the creation of more reusable and maintainable code and also enhances the readability of the code.

- **Static Polymorphism (compile-time)**: implemented through method overloading. The compiler determines which method to call based on the method declaration (method name and parameter list).

- **Dynamic Polymorphism (run-time)**: implemented through method overriding. The runtime (JVM) determines which method to call based on the actual object on which the method is called.

"Dynamic polymorphism" (runtime polymorphism achieved through method overriding) is often termed "true polymorphism". This is because the decision on which method to call during runtime is based on the actual object type, which is the key feature of polymorphism in object-oriented programming.

---

Yes, polymorphism is indeed about flexibility. It's the primary mechanism in Java that renders our code flexible.

Since a class contains all methods of the class it inherits from, an object of this class can be stored in a variable of any of its parent types.

If, as a result of assignment, we move up the inheritance chain (towards the `Object` type), it's termed type widening (also known as upcasting). Conversely, if we move down, towards the object type, it's termed type narrowing (or downcasting).

---




---
### Class Object

The `Object` class in Java holds a special place in the hierarchy of the Java programming language. It is the root of the class hierarchy in Java, meaning that any other class implicitly inherits from the `Object` class unless otherwise specified. This provides basic functionality for all objects in Java and is the foundation for implementing polymorphism.

### Inheritance and the Object Class

When a class does not explicitly extend another class, it implicitly inherits from the `Object` class. This means that any object in Java inherits the basic methods of the `Object` class, which can be overridden to change their behavior in subclasses. Inheritance from `Object` provides a common type for all objects and allows any object in Java to be used where `Object` is expected.

### Polymorphism and the Object Class

Polymorphism in Java allows the same reference variable to refer to objects of different types. Thanks to all classes being inherited from `Object`, a variable of type `Object` can be used to refer to any object regardless of its specific class. This allows, for example, storing objects of different types in collections, since they are all descendants of the `Object` class.

### Main Methods of the Object Class

The `Object` class provides several methods that are significant for working with objects in Java:

- **`equals(Object obj)`**: Determines whether the current object is equal to another object. The method can be overridden in subclasses to implement object comparison by value.
- **`hashCode()`**: Returns the hash code of the object, which is used in collections, such as `HashMap`. Overriding this method is important when changing the behavior of `equals` to maintain the contract between `equals` and `hashCode`.
- **`toString()`**: Returns a string representation of the object. It is often overridden in subclasses to provide a more informative description of the object.
- **`clone()`**: Creates and returns a copy of the object. To use this method, the class must implement the `Cloneable` interface.
- **`getClass()`**: Returns the `Class` object that represents the runtime class of the object. This method can be used to obtain meta-information about the class.
- **`finalize()`**: Called by the garbage collector before the object is destroyed. This method can be overridden to implement resource cleanup before the object's destruction, but its use is not recommended due to the unpredictability of garbage collection operations.

All methods are documented in [the documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html).

Inheritance from the `Object` class in Java guarantees that the methods defined in the `Object` class are available in all classes, even if these classes are user-defined or part of the Java API. This means that every object in Java inherits a basic set of methods that can be used for fundamental operations, such as comparing objects, obtaining an object's hash code, obtaining a string representation of an object, and others.

### Inheritance and Universality of Methods

Thanks to inheritance from the `Object` class, we can be assured that any object in Java will possess a certain basic behavior. This makes objects in Java interchangeable in contexts where the `Object` type is expected and provides basic functionality for any type of objects.

### Polymorphism and Method Overriding

Polymorphism in Java allows classes to override (override) methods inherited from the `Object` class to provide class-specific behavior. For example, by overriding the `equals()` method, one can define when two objects are considered equal based on their content, rather than identity of references. Similarly, overriding `toString()` allows returning a string representation of the object, which may be more informative and understandable for humans.

Overriding methods of the `Object` class provides two important aspects of polymorphism:
- **Compile-time**: The Java compiler allows overriding methods, ensuring that subclasses can provide their own implementation for inherited methods.
- **Runtime**: The Java Virtual Machine (JVM) determines at runtime which version of the method should be called based on the actual type of the object, allowing the same reference to call different implementations of methods depending on the type of object it points to.

### Conclusion

Thus, the presence of the `Object` class methods in all Java classes and the ability to override them are fundamental aspects of object-oriented programming in Java. This ensures universality and flexibility when working with objects of various types, allowing developers to modify or extend the basic behavior of objects to meet the specific requirements of their programs.


</details>