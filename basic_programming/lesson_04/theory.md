<details>
  <summary style="cursor: pointer;"><b>English</b></summary>



</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

## 0. Выполнение поставленной задачи
* Поставленные задачи в IT должны выполняться с 100% точностью, т.е. описание ТЗ должно полностью совпадать с результатом.
* Это значит, что перевыполнение и недовыполнение одинаково плохо будут восприниматься.

## 1. Лексемы
* Лексемы (в ЯП) - группы слов/символов, которые фундаментально отличаются друг от друга.
* Виды лексем:
  * Ключевые слова
    * Служат для обозначения каких-то действий языка программирования
    * Другими словами, эти слова зарезервированы ЯП
  * Идентификаторы
    * Служат для именования создаваемых элементов в ЯП
    * Идентификаторы могут в себе содержать только буквы, цифры и знак `_`
    * Также, идентификатор не может быть таким же как любое ключевое слово
  * Операторы
    * Обозначения действий математики, логики, и другие служебные пометки
    * Операторы обычно обозначаются символами, а не буквами (с парой исключений)
    * У операторов есть приоритетность
  * Константы (литералы)
    * Служат для обозначения каких-то числовых или строковых значений

## 2. Тип String и действия с ним
* String - строковый тип. Он нужен, чтобы хранить строки.
* По структуре представляет собой набор (массив) символов типа char. Отсчет символов начинается с 0.
* То есть, в строке `"Hello"` первым символов будет `e`, а символ `H` будет нулевым.

* String - не примитивный тип, а ссылочный. Это значит что у него есть свои методы, которые можно вызывать.
* Метод - кусок кода, который можно вызвать из ссылочной переменной, и он выполнит какие-то действия с ней.
* Чтобы вызвать метод, после идентификатора переменной ставим точку, выбираем нужный метод, и пишем круглые скобочки после
него чтобы вызвать.

* Основные методы:
* length() - позволяет получить количество символов в строке
* charAt(int) - позволяет получить символ по его номеру 
* substring(int, int) - позволяет получить подстроку, т.е. часть строки между двумя переданными индексами
* equalsStrings() - вернет true если переданная строка идентична той, на которой этот метод вызвали
* equalsIgnoreCase() - вернет true если переданная строка идентична той, на которой этот метод вызвали, но без 
учета регистра (маленькие/большие буквы)

* Параметризация - процесс вынесения некоторых (повторяемых) значений в отдельные переменные, где к этим значениям будет
легкий доступ, т.е. их можно будет быстро поменять в одном месте, и они изменятся во всех остальных
* Конкатенация - процесс объединения строки с любым другим значением в одну строку

## 03. Scanner
* Scanner - это такой тип, который позволяет читать из внешних ресурсов, таких как файлы и консоль.
* Это значит, что с помощью него мы сможем читать ввод из консоли.

</details>
