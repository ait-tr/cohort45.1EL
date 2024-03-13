package classwork1303;

public class Main02 {
    public static void main(String[] args) {
        String helloStr = "Hello world!";

        System.out.println(helloStr);
        System.out.println(helloStr.length());
        // получаем символ по индексу 0
        char firstLetter = helloStr.charAt(0);
        System.out.println(firstLetter);
        // получаем индекс буквы w
        int wIndex = helloStr.indexOf('w');
        System.out.println(wIndex);
        // получаем часть строки между 0 и 5 индексом
        String word = helloStr.substring(0, 5);
        System.out.println(word);

        System.out.println(word.equalsIgnoreCase("hello"));

    }
}






//String otherWord = helloStr.substring(helloStr.indexOf('w'), helloStr.indexOf('d') + 1);
//System.out.println(otherWord);