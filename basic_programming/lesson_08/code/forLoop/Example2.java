package code.forLoop;

public class Example2 {
    public static void main(String[] args) {
        /*
        напечатать все буквы из слова по одной
         */

        String text = "I love Java";

//        System.out.println(text.charAt(0));
//        System.out.println(text.charAt(1));
//        System.out.println(text.charAt(2));
//        System.out.println(text.charAt(3));
//        System.out.println(text.charAt(4));
//        System.out.println(text.charAt(5));
//
//        System.out.println(text.charAt(6));
//        System.out.println(text.charAt(7));
//        System.out.println(text.charAt(8));
//        System.out.println(text.charAt(9));
//        System.out.println(text.charAt(10));


        int textSize = text.length();

        for (int i = 0; i < textSize; i++) {
            System.out.println(text.charAt(i));
        }

        // ---- с помощью цикла WHILE ------

        int counter = 0;

        while (counter < textSize) {
            char currentChar = text.charAt(counter);
            System.out.println("Буква с индексом " + counter + " : " + currentChar);
            counter++;
        }



    }
}
