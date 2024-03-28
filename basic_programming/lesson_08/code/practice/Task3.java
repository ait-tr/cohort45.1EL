package code.practice;

public class Task3 {
    /*
    У вас есть строка текста
    Требуется - заменить из нее все специальные символы, такие как:
    "(", ")", "@" на символ 'пробел'
     */

    public static void main(String[] args) {
      String originalText = "Пример текста (с) некоторыми специальными (&) символами.";

      String changedText = "";
      // ----------------

        for (int i = 0; i < originalText.length(); i++) {
            char currentChar = originalText.charAt(i);
            if ((currentChar == '(') || (currentChar == ')') || (currentChar == '&')) {
                currentChar = ' ';
            }
            changedText = changedText + currentChar;
        }

      // ----------------
      System.out.println("Текст без специальных символов: ");
      System.out.println(changedText);
    }
}
