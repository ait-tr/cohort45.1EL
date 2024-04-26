package classwork2604.example02;

public class MyArrayList {
    private String[] array;

    private int size;

    public MyArrayList(int initialSize) {
        size = initialSize;
        array = new String[size];
    }

    public MyArrayList() {
        this(0);
    }

    public int getSize() {
        return size;
    }

    // получить элемент массива
    public String get(int index) {
        return array[index];
    }
    // задать значение элемента массива
    public void set(int index, String value) {
        array[index] = value;
    }

    // вернуть индекс значения value
    public int indexOf(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // содержится ли value в списке?
    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    public void resize(int newSize) {
        // создаем новый массив нужного размера
        String[] temp = new String[newSize];

        // Math.min - выбирает минимальное из двух переданных значений
        // выбираем меньший из размеров
        int minSize = Math.min(size, newSize);

        // копируем элементы из старого массива в новый
        for (int i = 0; i < minSize; i++) {
            temp[i] = array[i];
        }

        // меняем ссылку и сохраненный размер массива
        array = temp;
        size = newSize;
    }

    public void add(String value) {
        if (size + 1 > array.length) {
            // меняем размер массива
            resize(size + 1);
            // отнимаем 1 потому что в resize уже изменили переменную size
            array[size - 1] = value;
        } else {
            // вставляем элемент по индексу размер (после последнего)
            array[size] = value;
            // размер увеличиваем
            size++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Доп задание: написать метод add(String value, int index), который добавляет элемент по индексу

}
