<details>
  <summary style="cursor: pointer;"><b>English</b></summary>



</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

## 0. Написание кода
* Код всегда нужно писать так, будто вы делаете это для другого человека.
* Лучший код - самодокументируемый. Это значит, что в нем интуитивно понятно что и зачем нужно.
* 80% работы это выбор идентификаторов. Идентификатор должен быть:
  * Написанным на английском. Не на русском, не на немецком, а именно на английском и английскими словами.
  * Никаких не общеизвестных аббревиатур или сокращений.
    * Крайне очевидные сокращения разрешаются, но это только те, которые есть в коде.
    * Например `InputStream is;` - позволяется, но `int tAmount; // tax amount` - нет. 
  * Не именовать переменные словами либо буквами с добавлением обычного числа.
    * Например, переменные r1, r2, r3, r4; или num1, num2, num3 будут очень плохо читаться.
    * Единственная ситуация когда такое разрешено, это когда есть рассчеты по формулам, в которых параметры так и записаны.
  * Пишется в стиле lowerCamelCase.
    * Это значит, что первое слово пишется с маленькой буквы, а каждое следующее с большой.
  * Должен быть существительными в именительном падеже в единственном числе.

## 1. Логические операторы
* Высказывания могут быть истинными (1, true) и ложными (0, false)
* Например:
  * сейчас лето - ложь
  * сейчас вечер - истина
  * сейчас лето **и** сейчас день - ложь
  * сейчас лето **или** вечер - истина
  * сейчас **не** лето - истина
* Операторы сравнения применяются к числовым типам данных и символам:
  * Больше >
  * Меньше <
  * Равно ==
  * Больше или равно >=
  * Меньше или равно <=
  * Не равно !=
* Логические операторы применяются к логическим выражениям, т.е. тем, тип которых будет boolean:
  * И &&
  * ИЛИ ||
  * НЕ !
* `&` - амперсанд
* `|` - вертикальный слеш
* Напоминание:
* `/` - слеш
* `\` - обратный слеш

## 1.5 Свойства операторов
* Операторы (все, не только логические) делятся на некоторые группы по различным свойствам
* По количеству значений, над которыми выполняется операция:
  * Унарные
    * `-` - унарный минус, пишется перед числом и делает его отрицательным, например `-45`
    * `!` - логическое НЕ
    * Некоторые другие...
  * Бинарные
    * Почти все арифметические, логические, побитовые и операторы присвоения, т.е. `+ - * / % || | && & == < > <= >= != = += -= /= *= %=`
    * Некоторые другие...
  * Тернарные
    * `?:` - условный тернарный оператор
* По направлению выполнения операции (ассоциативность):
  * Слева направо (L -> R)
    * Почти все бинарные операторы и тернарный
  * Справа налево (L <- R)
    * Операторы присвоения
* Например, когда есть выражение `5 + 6 + 8` будет сначала выполняться 5 + 6, а потом к результату прибавится 8
* У всех операторов с одинаковой приоритетностью всегда будет одна ассоциативность

## 2 Условный оператор
* Алгоритмы бывают трех видов:
1. Линейный - когда программа выполняется по прямой линии (одна инструкция за другой)
2. Разветвленный - когда части программы могут выполняться либо не выполняться (некоторые инструкции выполняются либо нет)
3. Цикличный - когда внутри программы одно и то же действие выполняется несколько раз (некоторые инструкции выполняются повторно)

* В Java разветвленный алгоритм реализуется через условные операторы (conditional operator)
* Синтаксис:
```
if (условие) {
	// код который надо выполнить, если условие истинно
}
```
* Этот код будет выполняться если условие истинно. Если условие ложно, никаких действий не будет.
* Если нужно сделать так, чтобы при ложном условии выполнялся другой код, используется else
```
if (условие) {
	// код который надо выполнить, если условие истинно
} else {
    // код который надо выполнить, если условие ложно
}
```
* Если нужно выполнить три или более кода в зависимости от последовательных условий, используется такая структура
```
if (условие 1) {
	// код который надо выполнить, если первое условие истинно
} else if (условие 2) {
    // код который надо выполнить, если второе условие истинно 
} else {
    // код который надо выполнить, если последнее проверенное условие истинно
}

```


</details>