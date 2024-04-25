package enums;
/*
@date 25.04.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

public class EnumExample {

    public static void main(String[] args) {

        User user = new User("test@mail.com", "qwwerty!1");

        user.setRole(Role.ADMIN);

        System.out.println(user.info());

        Day today = Day.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Today is WEDNESDAY or THURSDAY or FRIDAY");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
        }

        // Можем получить массив со значениями Enum

        Day[] days = Day.values();

        System.out.println(Arrays.toString(days));

        for (int i = 0; i < days.length; i++) {
            if (days[i] == today) {
                // ordinal - порядковый номер константы (начинается с 0)

                int ordinal = days[i].ordinal();
                System.out.println("Порядковый номер в перечислении: " + ordinal);
                System.out.println("Найден день недели: " + days[i]);
            }
        }

    }
}
