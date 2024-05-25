## Задача 1
* Переделать домашнее задание из урока 12 (там где магазин) используя HashMap
* При желании, вместо ДЗ урока 12 в качестве базы для этого задания можете взять ДЗ из урока 23

## Задача 2
* Разработать класс Песня. Определить поля название, имя исполнителя и длительность.
* Переопределить toString таким образом, чтобы он выводил песню в таком формате:
* <исполнитель> - <название> (<длительность>)
* Например: The Weekend - Blinding lights (3:20)
* Естественно, что длительность нужно сохранить в секундах, а выводить в минутах и секундах.

* Создать класс Плейлист. В нем создать поле песни (это будет коллекция), которое будет хранить песни, сохраненные в этот плейлист.
* Определить методы для доступа к отдельным песням, а так же методы для добавления и удаления песен.

* Определить такие методы: 
- getListeningQueue - вернет очередь из всех песен плейлиста в том порядке, в котором они добавлены.
- getReverseListeningQueue - вернет очередь всех песен в обратном порядке.
- getShuffledListeningQueue - вернет очередь из всех песен в случайном порядке.
* Обратите внимание, что ни один из этих методов не должен изменять порядок песен в самом плейлисте.

* В методе меин создать плейлист песен и метод "послушать плейлист", который получит плейлист, из него возьмет очередь
песен, и выведет каждую песню в таком формате:
* Играет песня: <песня>
* Вы также можете создать перечисление для типа порядка песни (обычный, обратный, перемешанный) и передавать
в этот метод