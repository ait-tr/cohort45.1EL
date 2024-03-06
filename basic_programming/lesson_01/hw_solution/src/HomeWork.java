public class HomeWork {
    public static void main(String[] args) {

        /* Задание: вывести по строкам
         - имя
         - фамилия
         - дату рождения
         - город
         */

        System.out.println("Anton");
        System.out.println("Okhrimenko");
        System.out.println("18.08.1989");
        System.out.println("Hamburg\n");

        // тест с переносом строки принудительно
        System.out.println("-Anton\n-Okhrimenko\n-18.08.1989\n-Hamburg\n");

        // тест обьявления строковых переменных
        String name = "Anton", surname = "Okhrimenko", dateOfBirth = "18 August", city = "Hamburg";
        System.out.println(name+"\n"+surname+"\n"+dateOfBirth+"\n"+city+"\n");

    }
}
