<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

## 0. Rules of the professional environment

### How to ask questions

* Questions must be asked in such a way as to minimize the amount of time spent.
* This means:
1. Give only the necessary details;
2. Ask specific questions;
3. Use the correct terminology;
4. Form the question correctly.
  * The structure of the question: (it happened to me) -> (I tried to do it) -> (in the end it happened)
5. Before asking a question about the problem, read the error message.
  * I.e. place the cursor on the underlined line and read the error message in the pop-up window.

## 1. Data types
* A variable represents a memory area assigned a specific name
* A variable contains data of a certain type - an integer, a real number, a symbol, etc.
* To use a variable, it must be declared, specifying the name and type
```
int number = 10;
```
* A variable can be assigned any value corresponding to its type
```
int number = "Hello"; // Incorrect

int number = 45; // Correct
```

* List of primitive data types:
  * Integer (whole numbers)
    * byte - 1 byte
    * short - 2 bytes
    * int - 4 bytes
    * long - 8 bytes
  * Real (non-integer numbers)
    * float - 4 bytes
    * double - 8 bytes
  * Symbolic (letters and symbols)
    * char - 1 byte
  * Logical (1 or 0, true or false)
    * boolean - 1 byte

* A literal is any value (numeric, symbolic, string) written in the code.
* Literals also have their own data types
* Types of data literals:

* `456` - int
* `456L` - long
* `456.0` - double
* `465.0f` or `456f` - float
* `'a'` - char
* `"Hello"` - String

* Integer literals can also be written in binary or hexadecimal representation
* `0b10110010110` - binary
* `0x4ab9f` - hexadecimal

* The underscore symbol `_` can be written anywhere inside a number
* `1_000_000_000`

## 02. Transformation of types
* Type conversion is an action in which the value of one type is converted into an equivalent value
  second type.
* There are direct and indirect transformations.
* Indirect transformations are when we write additional code or call an already written procedure for transformation.
* Direct conversion (type cast) is when we directly change the type of the value.
* For direct conversion, you need to write the target data type in parentheses before the value to be converted.
* Transformations are also explicit and implicit.
* Explicit transformations are those that we must explicitly write.
* Implicit transformations are those that are performed automatically.
* Also, transformations are narrowing and expanding.
* Hierarchy of primitive types by which we will determine the type of transformation:
```
char - byte - short - int - long - float - double
```
* If you convert the type on the left to the type on the right, it will be an expanding conversion.
* Such a transformation is always allowed and may be implicit.
* If you convert the type from the right to the type from the left, it will be a narrowing conversion.
* Such conversion will not always be allowed implicitly.
* Explicit narrowing transformations are always allowed, but they can lead to data loss/corruption

* Please note that char is easily converted to any numeric type.
* The character is converted into a number according to the ASCII encoding table

## 3. Type overflow
* Overflow is such a phenomenon in a narrowing transformation, when a number does not fit within the bounds of the target type
* In case of overflow, all bytes on the left are trimmed to the required size. Accordingly, the data is lost, and in the end we get it
  absolutely second number.
* There are two types of overflow - overflow and underflow
* overflow is when we cross the positive border
* underflow is when we cross the negative border


## Useful features of Intellij
* If you did something wrong, you can always go back one step by pressing Ctrl + Z or Command + Z
* To cancel cancellation, press Y instead of Z.
* This combination can be pressed several times to cancel more actions
* The caret is your cursor in the text, in the place of which letters will appear when typing
* To create a new line under the current one, without breaking the line itself, you can press Shift + Enter
* To move all the text after the caret to the next line, press Ctrl + Enter, or Command + Enter (on a Mac)
* To create a new line above the current one, without breaking the line itself, you can press Ctrl + Alt + Enter or Command + Option + Enter (on a Mac)

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

## 0. Правила профессиональной среды

### Как задавать вопросы

* Вопросы нужно задавать так, чтобы максимально уменьшить количество потраченного времени.
* Это значит:
1. Давать только нужные подробности;
2. Задавать конкретные вопросы;
3. Использовать правильную терминологию;
4. Правильно формировать вопрос.
   * Структура вопроса: (у меня произошло это) -> (я попытался сделать это) -> (в итоге получилось это)
5. Перед тем как задать вопрос о проблеме, прочитать сообщение ошибки.
   * Т.е. навести курсор на подчеркнутую строку и прочитать сообщение ошибки в всплывающем окне.

## 1. Типы данных
* Переменная представляет собой участок памяти, которому присвоено определенное имя
* Переменная содержит данные определенного типа - целое число, вещественное число, символ и т.д.
* Чтобы использовать переменную, ее необходимо объявить, указав имя и тип
```
int number = 10;
```
* Переменной можно присвоить какое-либо значение, соответствующее ее типу
```
int number = "Hello"; // Неправильно

int number = 45; // Правильно
```

* Список примитивных типов данных:
  * Целочисленные (целые числа)
    * byte - 1 байт
    * short - 2 байта
    * int - 4 байта
    * long - 8 байт
  * Вещественные (нецелые числа)
    * float - 4 байта
    * double - 8 байт
  * Символьные (буквы и символы)
    * char - 1 байт
  * Логические (1 либо 0, истина или ложь)
    * boolean - 1 байт

* Литерал - это любое значение (числовое, символьное, строковое), записанное в коде.
* У литералов тоже есть свои типы данных
* Типы данных литералов:

* `456` - int
* `456L` - long
* `456.0` - double
* `465.0f` или `456f` - float
* `'a'` - char
* `"Hello"` - String

* Целочисленные литералы также можно записывать в бинарном или шестнадцатеричном представлении
* `0b10110010110` - бинарный
* `0x4ab9f` - шестнадцатеричный

* Символ подчеркивания `_` можно писать где угодно внутри числа
* `1_000_000_000`

## 02. Преобразование типов
* Преобразование типов - это такое действие, при котором значение одного типа конвертируется в эквивалентное значение 
другого типа.
* Преобразования бывают прямыми и непрямыми.
* Непрямые преобразования - это когда мы пишем дополнительный код или вызываем уже написанную процедуру для преобразования.
* Прямое преобразование (type cast) - это когда напрямую меняем тип значения.
* При прямом преобразовании нужно перед значением для преобразования написать целевой тип данных в скобках.
* Преобразования также бывают явными и неявными.
* Явные преобразования - такие, которые мы должны явно написать.
* Неявные преобразования - такие, которые выполняются автоматически.
* Также, преобразования бывают сужающими и расширяющими.
* Иерархия примитивных типов, по которым мы будем определять тип преобразования:
```
char - byte - short - int - long - float - double
```
* Если преобразовывать тип слева в тип справа, это будет расширяющее преобразование.
* Такое преобразование всегда разрешается и может быть неявным.
* Если преобразовывать тип справа в тип слева, это будет сужающее преобразование.
* Такое преобразование не всегда будет разрешено в неявном виде. 
* Явные сужающие преобразования всегда разрешены, но они могут привести к потере/повреждению данных

* Обратите внимание, что char без проблем переводится в любой числовой тип.
* Преобразование символа в число происходит по таблице кодировки ASCII

## 3. Переполнение типов
* Переполнение - это такое явление при сужающем преобразовании, когда число не помещается в границы целевого типа
* При переполнении все байты слева обрезаются до нужного размера. Соответственно, данные пропадают, и в итоге получаем
абсолютно другое число.
* Переполнение бывает двух видов - overflow и underflow
* overflow это когда мы переходим положительную границу
* underflow это когда мы переходим отрицательную границу


## Полезные фичи Intellij
* Если сделали что-то не то, всегда можно вернуться на шаг назад комбинацией Ctrl + Z или Command + Z\
* Чтобы отменить отменение вместо Z нажимаем Y.
* Эту комбинацию можно нажимать несколько раз, чтобы отменить больше действий
* Каретка - это ваш курсор в тексте, на месте которого будут появляться буквы при печати
* Чтобы создать новую строку под текущей, не разрывая саму строку, можно нажать Shift + Enter
* Чтобы перенести весь текст после каретки на следующую строку, нажимаем Ctrl + Enter, или Command + Enter (на маке)
* Чтобы создать новую строку над текущей, не разрывая саму строку, можно нажать Ctrl + Alt + Enter или Command + Option + Enter (на маке)
</details>
