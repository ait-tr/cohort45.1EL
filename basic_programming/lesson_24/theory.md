<details>
  <summary style="cursor: pointer;"><b>English</b></summary>



</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

## Класс Object
* Все классы в Java всегда наследуются от Object
* В классе Object описаны несколько полезных методов:
  * notifyAll, notify, wait - нужны для многопоточки
  * getClass - нужен для рефлексии
  * hashCode - позволяет получить из любого объекта его хеш-код (число)
  * toString - позволяет получить строковую репрезентацию объекта (переводит объект в строку)
  * equals - позволяет сравнить два объекта (проверить равенство)
* Переопределение метода - это когда код метода родительского класса заменяется на другой код, но метод остается тот же.
* Делается это автоматически, но обязательно нужно дописать аннотацию `@Override`
* Аннотация - специальная запись начинающаяся с знака `@`, и служащая для предоставления дополнительной информации
разработчику и компилятору.
* Аннотация всегда пишется перед объявлением класса либо метода.

* Хеш-функция - такая функция, которая превращает данные любой длинны в число, причем это число следует правилам:
  * Для любых данных длинна числа (в байтах) одинаковая
  * Для одинаковых данных число всегда будет одинаковым

## Преобразования объектов
* Преобразования бывают двух видов: восходящее и нисходящее
* Восходящее преобразование - это когда объект дочернего типа записывается в ссылку родительского типа.
* Нисходящее преобразование - это когда объект, записанный в ссылку родительского класса, будет записан обратно в
ссылку, соответствующую его классу.
* Чтобы сделать нисходящее преобразование, нужно выполнить два действия:
  * typecheck - проверка типа объекта, делается с помощью ключевого слова `instanceof`
  * typecast преобразование с записью в новую ссылку

* `instanceof` - позволяет проверить тип объекта, записанного по ссылке
```
Object o = "Hello!";
sout(o instanceof String); // true
sout(o instanceof Object); // true
sout(o instanceof Scanner); // false
```
* Он вернет истину если по ссылке слева от него записан объект класса стоящего справа, либо любого класса-родителя этого класса

## Метод equals
* Проверяет, равны ли два объекта - текущий и переданный как параметр
* Он включает в себя три проверки: ссылки, типа и значений.
* Проверка ссылки:
  * Если ссылка на переданный объект равна текущему, это однозначно один и тот же объект
* Проверка типа:
  * Если тип переданного объекта не равен типу текущего, это однозначно не тот же объект
* Проверка значений:
  * Если значения всех полей переданного объекта равны значениям соответствующих полей текущего объекта, это однозначно один и тот же объект

</details>