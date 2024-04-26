## Enums в Java

### Что такое Enums?
- Специальный тип данных, который позволяет переменной быть набором предварительно определенных значений.

**Основная цель Enums:**
- Обеспечивать типобезопасность и снижать количество ошибок.

---

### Создание Enums:
```
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```

### Использование Enums:
```
Day today = Day.MONDAY;
switch(today) {
    case MONDAY:
        System.out.println("Today is Monday.");
        break;
    // ... другие дни
}
```

---

## 3. Продвинутые возможности Enums

### Конструкторы и методы:
```
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6);
    // ... другие планеты

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
```

### Встроенные методы:
- `values()`: Возвращает массив, содержащий список констант Enum.
- `valueOf(String name)`: Возвращает константу Enum с указанным именем.

### Перечисление через цикл:
```
for (Day day : Day.values()) {
    System.out.println(day);
}
```

---

## 4. Сравнение Enums

### Сравнение с использованием `==` и `equals()`:
- Для сравнения двух значений Enum можно безопасно использовать оператор `==`.

### Метод `ordinal()`:
- Возвращает порядковый номер константы (начиная с нуля).

---

### EnumSet:
- Специализированный набор для работы с enums.
```
EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
```

### EnumMap:
- Специализированная карта для ключей типа Enum.
```
EnumMap<Day, String> dayActivityMap = new EnumMap<>(Day.class);
dayActivityMap.put(Day.MONDAY, "Work");
```

---
### Преимущества использования Enums:
- Типобезопасность.
- Читаемость кода.
- Возможность группировки связанных констант.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Enums in Java
### What are Enums?
- A special data type that allows a variable to be a set of predefined constants.

**Main Purpose of Enums:**
- To provide type safety and reduce the number of errors.

---

### Creating Enums:
```
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```

### Using Enums:
```
Day today = Day.MONDAY;
switch(today) {
    case MONDAY:
        System.out.println("Today is Monday.");
        break;
    // ... other days
}
```

---

## 3. Advanced Features of Enums

### Constructors and Methods:
```
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6);
    // ... other planets

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
```

### Built-in Methods:
- `values()`: Returns an array containing the list of Enum constants.
- `valueOf(String name)`: Returns the Enum constant of the specified name.

### Iterating through Enums:
```
for (Day day : Day.values()) {
    System.out.println(day);
}
```

---

## 4. Comparing Enums

### Comparison Using `==` and `equals()`:
- You can safely use the `==` operator to compare two Enum values.

### The `ordinal()` Method:
- Returns the ordinal number of the constant (starting from zero).

---

### EnumSet:
- A specialized set for use with enum types.
```
EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
```

### EnumMap:
- A specialized map for use with enum keys.
```
EnumMap<Day, String> dayActivityMap = new EnumMap<>(Day.class);
dayActivityMap.put(Day.MONDAY, "Work");
```

---
### Advantages of Using Enums:
- Type safety.
- Code readability.
- The ability to group related constants.

</details>