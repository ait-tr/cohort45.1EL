## Задание 1

* Написать программу которая выводит Hello procedural programming! в консоль.
* Поместить строку с выводом этого сообщения в отдельный метод.

## Задание 2

* Написать программу переводчик из цельсия в фаренгейт и наоборот.
* В программе, сначала нужно спросить пользователя, что в что он хочет перевести (C -> F или F -> C)
* Затем, спросить количество градусов, которое нужно перевести.
* Для перевода написать два метода: `double toCelsius(double degrees)` и `double toFahrenheit(double degrees)`
* Первый будет переводить фаренгейт в цельсий, а второй - наоборот.
* В зависимости от выбора в начале программы, вызвать соответствующий метод.
* ОГРАНИЧЕНИЕ: во всей программе из сканнера можно читать только два раза.
* Дополнительное задание: использовать в программе тернарный оператор вместо условного где применимо. Сделать так, чтобы
программа не заканчивалась, пока пользователь этого не захочет.

## Задание 3

* Написать программу, которая рассчитывает индекс массы тела (ИМТ) и говорит о состоянии веса.
* Для этого нужно написать такие методы:
* 1 Спросить у пользователя его вес в килограммах и рост в сантиметрах (целые числа)
* 2 Перевести рост в метры (для этого рост в см поделить на 100). Учтите, что результат будет не целым
* 3 Рассчитать ИМТ по формуле: вес / (рост ^ 2)
* 4 Вывести результат расчётов в консоль и оценку веса.
Критерии оценивания (диапазон значений и словесная оценка):
0-15 - Анорексия
15-20 - Недостаточный вес
20-25 - Нормальный вес
25-30 - Избыточный вес
30+ - Ожирение
