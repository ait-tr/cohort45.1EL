package equalsStrings;
/*
@date 25.04.2024
@author Sergey Bugaienko
*/

public class StringsExample {
    public static void main(String[] args) {
        
        
        String string1 = "Java";


        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);
            System.out.println("Current char " + ch);
        }

        char[] chars =  string1.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        String someString = "Java 17";

        String string2 = "Java";

        String string3 = new String("Java");

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        System.out.println("\n ===================== \n");

        boolean isEquals = string1 == string2; // сравнение ССЫЛОК.

        // Pool строк

        System.out.println("string1 == string2 -> " + (string1 == string2));

        System.out.println("string1 == string3 -> "  + (string1 == string3));

        System.out.println("string1.equals(string2) -> " + string1.equals(string2));
        System.out.println("string1.equals(string2) -> " + string1.equals(string3));



    
    
    }
}
