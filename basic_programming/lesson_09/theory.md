## 01. Циклы
* Иногда возникает надобность выполнять один и тот же код несколько раз.
* Такую возможность (без повторения кода) нам предоставляют циклы.
* Циклы - это такие записи, которые позволяют выполнять один и тот же блок кода несколько раз
* Циклы в Java есть четырех видов:
  * Условный цикл (while)
  * Пост-условный цикл (do-while)
  * Итеративный цикл (for(i))
  * Цикл "для каждого" (for-each)
* Блок кода цикла называется телом цикла.
* А одно выполнение тела цикла - итерация.

* Условный цикл
  * Выполняет код в зависимости от условия (очень похож на if)
  * Синтаксис такой же как в условном операторе, только `while` вместо `if`, и не существует `else`
  * Условие будет проверяться перед каждой итерацией
* Пост-условный цикл
  * Выполняет код в зависимости от условия
  * Синтаксис:
```
do {
  // выполняемый код
} while (условие);
```
  * Проверяет условие после выполнения итерации
  * Гарантирует одно выполнение тела цикла
* Итеративный цикл (for)
  * Кардинально отличается от предыдущих циклов по синтаксису, но имеет ту же задачу - выполнять код несколько раз
  * Выполняет код определенное количество раз
  * Синтаксис:
```
for (объявление переменной-счетчика; условие продолжения цикла; изменение переменной-счетчика){
  // выполняемый код
}  
```
  * Обычно внутри такого цикла постоянно будет использоваться переменная-счетчик
  * Также, ее принято называть одной буквой i. Если есть надобность добавить еще счетчиков,
  используются буквы j и k


## 2 Класс Math
* В Java есть класс, который позволяет делать базовые математические операции, называется Math
* Операции:
  * pow - степень
  * sqrt - квадратный корень
  * sin cos tan - тригонометрические функции
  * max/min - возвращают большее/меньшее двух чисел
  * abs - значение по модулю
  * round - математическое округление до целого
  * ceil - округление до большего
  * floor - округление до меньшего

## 3. Массивы
* Структура данных - такая конструкция, которая позволяет хранить много значений по каким-то определенным правилам, но обращаться
к ним из одной переменной
* Массив - самая простая структура данных.
* Массив позволяет хранить **определенное** количество **однотипных** значений.
* Доступ к значениям осуществляется через индексацию.
* Индексация - тоже самое, что нумерация, только начинается с 0.
* Синтаксис:
```
int[] array = {45, 19, -7, 123}; // если значения уже можно записать

int[] array = new int[4]; // создание пустого массива (если значения еще не известны)
```


## Полезно
* Чтобы дублировать файл, его можно взять, и перетянуть на ту же папку в которой он лежит,
зажав ctrl/strg или option на маке
